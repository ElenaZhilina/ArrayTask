package ru.netology.stats;

public class StatsService {
    public long summa(long[] sales) {
        long summaProdaj = 0;
        for (long sale : sales) {
            summaProdaj += sale;
        }
        return summaProdaj;
    }

    public long averageSum(long[] sales) {
        return summa(sales) / sales.length;
    }

    public int maxSaleMonth(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[month] <= sales[i]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int minSaleMonth(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[month] >= sales[i]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int belowAverageMonth(long[] sales) {
        int number = 0;
        long averageSumSale = averageSum(sales);
        for (long sale : sales) {
            if (sale < averageSumSale) {
                number++;
            }
        }
        return number;
    }

    public int aboveAverageMonth(long[] sales) {
        int number = 0;
        long averageSumSale = averageSum(sales);
        for (long sale : sales) {
            if (sale > averageSumSale) {
                number++;
            }
        }
        return number;
    }

}
