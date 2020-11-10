package ru.netology.statistic;

import org.apache.commons.lang3.builder.ToStringExclude;

public class StatisticsService {
  /**
   * Calculate index of max income
   *
   * @param incomes - array of incomes
   * @return - index of first max value
   */
  public long findMax(long[] incomes) {
    long current_max_index = 0;
    long current_max = incomes[0];
    for (long income : incomes)
      if (current_max < income)
        current_max = income;
    return current_max;
  }

  public long findMin(long[] incomes) {
    long min = incomes[0];

    for (long income : incomes) {
      if (income < min) {
        min = income;
      }
    }
    return min;
  }

  public long sum(long[] purchases) {
    long sum = 0;
    for (long purchase : purchases) {
      sum += purchase;
    }
    return sum;
  }

  public long findMonthWithMax(long[] incomes) {
    long max = findMax(incomes);
    int numberOfMonth = 0;
    int numberOfMonthWithMax = 0;

    for (long income : incomes) {
      if (income == max) {
        numberOfMonthWithMax = numberOfMonth;
      }
    }
    return numberOfMonthWithMax;
  }

  public long findMonthWithMin(long[] incomes) {
    long min = findMin(incomes);
    int numberOfMonth = 0;
    int numberOfMonthWithMin = 0;


    for (long income : incomes) {
      numberOfMonth += 1;
      if (income == min) {
        numberOfMonthWithMin = numberOfMonth;
      }
    }
    return numberOfMonthWithMin;
  }

  public long average(long[] incomes) {
    long sum = sum(incomes);
    return sum / incomes.length;
  }

  public long monthLessThenAverageCount(long[] incomes) {
    long average = average(incomes);
    int count = 0;
    for (long income : incomes) {
      if (income < average) {
        count++;
      }
    }
    return count;
  }

  public long monthMoreThenAverageCount(long[] incomes) {
    long average = average(incomes);
    int count = 0;
    for (long income : incomes) {
      if (income > average) {
        count++;
      }
    }
    return count;
  }

}






