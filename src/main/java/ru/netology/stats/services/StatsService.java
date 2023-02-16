package ru.netology.stats.services;


public class StatsService {


    public long sumSalesInYear(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }


    public long averageSalesInMonth(long[] sales) {
        long sum = 0;
        long average = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            average = sum / sales.length;
        }
        return average; //return sum(sales) / sales.length; - упрощение кода из вебинара
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
        long sum = 0;
        long average;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;
        for (long sale : sales) {
            if (sale < average) {
                monthBelow++;
            }
        }
        return monthBelow;
    }

        public int salesAboveAverage ( long[] sales){
            int monthAbove = 0;
            long sum = 0;
            long average;
            for (int i = 0; i < sales.length; i++) {
                sum = sum + sales[i];
            }
            average = sum / sales.length;
            for (long sale : sales) {
                if (sale > average) {
                    monthAbove++;
                }
            }
            return monthAbove;
        }
    }



