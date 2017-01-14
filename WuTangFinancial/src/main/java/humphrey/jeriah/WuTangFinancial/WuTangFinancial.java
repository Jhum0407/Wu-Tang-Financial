package humphrey.jeriah.WuTangFinancial;
import java.util.Scanner;
/**
 * Created by jeriahhumphrey on 1/13/17.
 */
public class WuTangFinancial {

    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        Currency currency= new Currency();
        System.out.println("Welcome To Wu-Tang Financial." + "\n" +"DIVERSIFY YO BONDS!!!");
        System.out.println( "\n" + "List what currency you have from these choices: US Dollar,Euro,British Pound, " +
                "Indian Rupee,Australian Dollar," + "\n" + "Canadian Dollar, Singapore Dollar,Malaysian Ringgit," +
                "Japanese Yen, or Chinese Yuan. Press Enter when you are done.");
        System.out.println("\n" +"Then list what currency you would like to convert to from the same list and hit enter.");
        System.out.println( "\n" +"Finally, enter the monetary amount in dollars and cents, without the $, and hit enter");
        currency.currencyExchange(input.nextLine(), input.nextLine(), input.nextDouble());








    }
}
