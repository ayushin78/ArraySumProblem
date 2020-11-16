package com.ayushin78;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraySumTest {
    @Test
    public void testCountPairsWithLesserSumWhenDistinct() {
        int[] arr1 = new int[]{3, 2, 1, 5, 4, 6};
        int sum1 = 8, expectedCount1 = 9;
        int[] arr2 = new int[]{7, 4, 13, 2, 3, 8};
        int sum2 = 12, expectedCount2 = 8;


        ArraySum arraySum = new ArraySum();
        int actualCount1 = arraySum.countPairsWithLesserSum(arr1, sum1);
        int actualCount2 = arraySum.countPairsWithLesserSum(arr2, sum2);
        Assertions.assertEquals(expectedCount1, actualCount1);
        Assertions.assertEquals(expectedCount2, actualCount2);
    }

    @Test
    public void testCountPairsWithLesserSumWhenRepeating() {
        int[] arr = new int[]{3, 2, 2, 1, 5, 4, 1, 4, 6};
        int sum = 8, expectedCount = 26;

        ArraySum arraySum = new ArraySum();
        int actualCount = arraySum.countPairsWithLesserSum(arr, sum);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountPairsWithLesserSumWhenNegativeIntegersPresent() {
        int[] arr = new int[]{-1, 2, 7, -2, 3, 6, 10};
        int sum = 8, expectedCount = 10;

        ArraySum arraySum = new ArraySum();
        int actualCount = arraySum.countPairsWithLesserSum(arr, sum);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testCountPairsWhenEmptyArray() {
        int[] arr = new int[]{};
        int sum = 8, expectedCount = 0;

        ArraySum arraySum = new ArraySum();
        int actualCount = arraySum.countPairsWithLesserSum(arr, sum);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testFindLesserValueIndex() {
        int[] arr = new int[]{1, 4, 5, 7, 8, 10};
        int num = 9, startIndex = 1;

        int expectedIndex = 4;
        ArraySum arraySum = new ArraySum();
        int actualIndex = arraySum.findLesserValueIndex(arr, startIndex, num);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testFindLesserValueIndexWhenNoLesserValueOnRight() {
        int[] arr = new int[]{1, 4, 5, 7, 8, 10};
        int num = 4, startIndex = 2;

        int expectedIndex = -1;
        ArraySum arraySum = new ArraySum();
        int actualIndex = arraySum.findLesserValueIndex(arr, startIndex, num);
        Assertions.assertEquals(expectedIndex, actualIndex);
    }

}

