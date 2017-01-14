package humphrey.jeriah.WuTangFinancial;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

/**
 * Created by jeriahhumphrey on 1/12/17.
 */
public class CurrencyTest {

    Currency currency;

    @Before
    public void setup(){
        currency= new Currency();
    }
    @Test
    public void getCurrencyRateUSDollarTest(){
        Double expected= 1.00;
        Double actual= currency.getCurrencyRate("US Dollar");
        assertEquals("I expect the US Dollar rate to be 1.00", expected, actual);

    }

    @Test
    public void getCurrencyRateEuroTest(){
        Double expected= 0.94;
        Double actual= currency.getCurrencyRate("Euro");
        assertEquals("I expect the Euro rate to be 10.94", expected, actual);

    }
    @Test
    public void getCurrencyRatePoundTest(){
        Double expected= 0.82;
        Double actual= currency.getCurrencyRate("British Pound");
        assertEquals("I expect the British Pound rate to be 0.82", expected, actual);

    }
    @Test
    public void getCurrencyRateRupeeTest(){
        Double expected= 68.32;
        Double actual= currency.getCurrencyRate("Indian Rupee");
        assertEquals("I expect the Indian Rupee rate to be 68.32", expected, actual);

    }
    @Test
    public void getCurrencyRateAusDollarTest() {
        Double expected = 1.35;
        Double actual = currency.getCurrencyRate("Australian Dollar");
        assertEquals("I expect the Australian Dollar rate to be 1.35", expected, actual);
    }

    @Test
    public void getCurrencyRateCanDollarTest(){
        Double expected= 1.32;
        Double actual= currency.getCurrencyRate("Canadian Dollar");
            assertEquals("I expect the Canadian Dollar rate to be 1.32", expected, actual);

        }

    @Test
    public void getCurrencyRateSingDollarTest() {
        Double expected = 1.43;
        Double actual = currency.getCurrencyRate("Singapore Dollar");
        assertEquals("I expect the Singapore Dollar rate to be 1.43", expected, actual);
    }

    @Test
    public void getCurrencyRateFrancTest() {
        Double expected = 1.01;
        Double actual = currency.getCurrencyRate("Swiss Franc");
        assertEquals("I expect the Swiss Franc rate to be 1.01", expected, actual);
    }

    @Test
    public void getCurrencyRateRinggitTest() {
        Double expected = 4.47;
        Double actual = currency.getCurrencyRate("Malaysian Ringgit");
        assertEquals("I expect the Malaysian Ringgit rate to be 4.47", expected, actual);
    }

    @Test
    public void getCurrencyRateYenTest() {
        Double expected = 115.84;
        Double actual = currency.getCurrencyRate("Japanese Yen");
        assertEquals("I expect the Japanese Yen rate to be 115.84", expected, actual);
    }
    @Test
    public void getCurrencyRateYuanTest() {
        Double expected = 6.92;
        Double actual = currency.getCurrencyRate("Chinese Yuan");
        assertEquals("I expect the Chinese Yuan rate to be 6.92", expected, actual);
    }








}
