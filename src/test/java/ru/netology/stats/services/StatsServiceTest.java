package ru.netology.stats.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void salesSum() {
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sumSalesInYear(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void averageSalesSumInMonth() {
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.averageSalesInMonth(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthNumberSalesMax() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.monthSalesMax(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthNumberSalesMin() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.monthSalesMin(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void monthQuantityBelowAverage() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.salesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void monthQuantityAboveAverage() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.salesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }
}

