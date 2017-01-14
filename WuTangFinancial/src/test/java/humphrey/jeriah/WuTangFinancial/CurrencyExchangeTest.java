package humphrey.jeriah.WuTangFinancial;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 1/12/17.
 */
public class CurrencyExchangeTest {

    Currency currency;

    @Before
    public void setup(){
        currency= new Currency();

    }
    @Test
    public void currencyExchangeTestDollarToEuro(){
        Double expected= 0.94;
        Double actual= currency.currencyExchange("US Dollar", "Euro", 1.00);
        assertEquals("I expect 1.00 US Dollar to be worth 0.94 Euros", expected, actual);

    }

    @Test
    public void currencyExchangeTestEuroToDollar(){
        Double expected=1.06;
        Double actual= currency.currencyExchange("Euro", "US Dollar", 1.00);
        assertEquals("I expect 1.00 Euro to be worth 1.06 US Dollars", expected, actual);

    }
    @Test
    public void currencyExchangeTestEuroToPound(){
        Double expected=0.87;
        Double actual= currency.currencyExchange("Euro", "British Pound", 1.00);
        assertEquals("I expect 1.00 Euro to be worth 0.87 British Pounds", expected, actual);

    }

    //Exchange rates fluctuate
    @Test
    public void currencyExchangeTestPoundToRupee(){
        Double expected=83.31;
        Double actual= currency.currencyExchange("British Pound", "Indian Rupee", 1.00);
        assertEquals("I expect 1.00 British Pound to be worth 82.97 Indian Rupees", expected, actual);

    }

    @Test
    public void currencyExchangeTestRupeeToCanadianDollar(){
        Double expected=0.01;
        Double actual= currency.currencyExchange("Indian Rupee", "Canadian Dollar", 1.00);
        assertEquals("I expect 1.00 Indian Rupee to be worth 0.01 Canadian Dollars", expected, actual);

    }

    @Test
    public void currencyExchangeTestSingaporeDollarToFranc(){
        Double expected=0.70;
        Double actual= currency.currencyExchange("Singapore Dollar", "Swiss Franc", 1.00);
        assertEquals("I expect 1.00 Singapore Dollar to be worth 0.70 Swiss Francs", expected, actual);

    }

    @Test
    public void currencyExchangeTestCanadianDollarToSingaporeDollar(){
        Double expected=1.08;
        Double actual= currency.currencyExchange("Canadian Dollar", "Singapore Dollar", 1.00);
        assertEquals("I expect 1.00 Canadian Dollar to be worth 1.08 Singapore Dollars", expected, actual);

    }

    @Test
    public void currencyExchangeTestFrancToRinggit(){
        Double expected=4.42;
        Double actual= currency.currencyExchange("Swiss Franc", "Malaysian Ringgit", 1.00);
        assertEquals("I expect 1.00 Swiss Franc to be worth 4.42 Malaysian Ringgit", expected, actual);

    }
    @Test
    public void currencyExchangeTestRinggittoYen(){
        Double expected=25.91;
        Double actual= currency.currencyExchange("Malaysian Ringgit", "Japanese Yen", 1.00);
        assertEquals("I expect 1.00 Malaysian Ringgit to be worth 25.91 Japanese Yen", expected, actual);

    }
    @Test
    public void currencyExchangeTestYentoYuan(){
        Double expected=0.05;
        Double actual= currency.currencyExchange("Japanese Yen", "Chinese Yuan", 1.00);
        assertEquals("I expect 1.00 Japanese Yen to be worth 0.05 Chinese Yuan", expected, actual);

    }
}