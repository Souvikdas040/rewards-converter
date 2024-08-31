import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    // @Test
    // void convert_from_cash_to_miles() {
    //     double cashValue = 100;
    //     int expectedMilesValue = (int) (cashValue / RewardValue.MILES_TO_CASH_CONVERSION_RATE);
    //     var rewardValue = new RewardValue(cashValue);
    //     assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    // }

    @Test
    void test_convert_from_cash_to_miles() {
        RewardValue rewardValue = new RewardValue(100.0);
        int expectedMiles = 350; // Assuming a conversion rate of 0.0035
        int actualMiles = rewardValue.getMilesValue();
        assertEquals(expectedMiles, actualMiles);
    }

    // @Test
    // void convert_from_miles_to_cash() {
    //     int milesValue = 10000;
    //     double expectedCashValue = milesValue * RewardValue.MILES_TO_CASH_CONVERSION_RATE;
    //     var rewardValue = new RewardValue(milesValue);
    //     assertEquals(expectedCashValue, rewardValue.getCashValue());
    // }

    @Test
    void test_convert_from_miles_to_cash() {
        RewardValue rewardValue = new RewardValue(350);
        double expectedCash = 1.225; // Assuming a conversion rate of 0.0035
        double actualCash = rewardValue.getCashValue();
        assertEquals(expectedCash, actualCash, 0.001); // Allow for a small margin of error due to floating-point precision
    }
}
