package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomes);

        assertEquals(expected, actual);
    }
    @Test
    void findMax1() {
        StatisticService service = new StatisticService();

        long[] incomes = {-12, -5};
        long expected = -5;

        long actual = service.findMax(incomes);

        assertEquals(expected, actual);
    }
}
