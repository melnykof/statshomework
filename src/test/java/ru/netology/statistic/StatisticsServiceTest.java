package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 12;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }

  @Test
  void findMin() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 3;

    long actual = service.findMin(incomesInBillions);

    assertEquals(expected, actual);

  }


  @Test
  void shouldSum() {

    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 85;

    long actual = service.sum(incomesInBillions);

    assertEquals(expected, actual);
  }

  @Test
  void shouldMonthWithMax() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 0;
    long actual = service.findMonthWithMax(incomesInBillions);

    assertEquals(expected, actual);
  }

  @Test
  void shouldMonthWithMin() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 6;
    long actual = service.findMonthWithMin(incomesInBillions);

    assertEquals(expected, actual);
  }

  @Test
  void shouldAverage() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

    long expected = 7;
    long actual = service.average(incomesInBillions);
    assertEquals(expected, actual);
  }

  @Test
  void shouldLessThenAverage() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 5;

    long actual = service.monthLessThenAverageCount(incomesInBillions);

    assertEquals(expected, actual);

  }

  @Test
  void shouldMoreThenAverage() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

    long expected = 6;

    long actual = service.monthMoreThenAverageCount(incomesInBillions);

    assertEquals(expected, actual);
  }

  }








