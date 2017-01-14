package humphrey.jeriah.WuTangFinancial;


/**
 * Created by jeriahhumphrey on 1/12/17.
 */
public class Currency {
    private double rate;

    public double getCurrencyRate(String money) {
       String moneyUpper= money.toUpperCase();
        switch (moneyUpper) {
            case "US DOLLAR":
                rate = 1.00;

                break;

            case "EURO":
                rate = 0.94;
                break;

            case "BRITISH POUND":
                rate = 0.82;
                break;

            case "INDIAN RUPEE":
                rate = 68.32;
                break;

            case "AUSTRALIAN DOLLAR":
                rate = 1.35;
                break;


            case "CANADIAN DOLLAR":
                rate = 1.32;
                break;

            case "SINGAPORE DOLLAR":
                rate = 1.43;
                break;

            case "SWISS FRANC":
                rate = 1.01;
                break;

            case "MALAYSIAN RINGGIT":
                rate = 4.47;
                break;

            case "JAPANESE YEN":
                rate = 115.84;
                break;

            case "CHINESE YUAN":
                rate = 6.92;
                break;

            default:
                System.out.println("Invalid choice. Please choose exactly from: US Dollar,Euro,British Pound, " +
                        "Indian Rupee," + "\n" +"Australian Dollar, Canadian Dollar, Singapore Dollar,Malaysian Ringgit," +
                        "Japanese Yen, or Chinese Yuan.");

        }
            return rate;
    }

public double currencyExchange(String currency, String desiredCurrency, double amount){
        Currency c1= new Currency();
        double convertedAmount=0.0;
        convertedAmount= amount *c1.getCurrencyRate(desiredCurrency)/c1.getCurrencyRate(currency);
        convertedAmount= (Math.floor(convertedAmount * 100))/100;
        System.out.println(amount + " in " + currency + " is worth " + convertedAmount + " in " + desiredCurrency);
        return convertedAmount;


}

}