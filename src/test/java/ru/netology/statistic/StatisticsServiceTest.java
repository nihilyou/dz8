package ru.netology.statistic;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxInTheMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 39, 8, 6, 11, 11, 12};
        long expected = 39;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
