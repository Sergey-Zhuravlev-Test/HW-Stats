package ru.netology.stats.services;


public class StatsService {

    public long sumSalesInYear(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSalesInMonth(long[] sales) {
        return sumSalesInYear(sales) / sales.length;
    }

    public int monthSalesMax(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthSalesMin(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int monthBelow = 0;
        for (long sale : sales) {
            if (sale < averageSalesInMonth(sales)) {
                monthBelow++;
            }
        }
        return monthBelow;
    }

    public int salesAboveAverage(long[] sales) {
        int monthAbove = 0;
        for (long sale : sales) {
            if (sale > averageSalesInMonth(sales)) {
                monthAbove++;
            }
        }
        return monthAbove;
    }
}



