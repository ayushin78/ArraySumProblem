package com.ayushin78;

import java.util.Arrays;

public class ArraySum {
    /**
     * @param arr array of integers
     * @param sum integer
     * @return count of pairs from integer whose sum is lesser than given sum
     */
    public int countPairsWithLesserSum(int arr[], int sum) {
        Arrays.sort(arr);
        int count = 0;

        /**
         For every index,
         1. find the remaining value to form the required sum
         2. Use binary search to search for the index having value just lesser than the remaining.
         3. Increase count by difference between the lesserValueIndex and currentIndex
         */
        for (int i = 0; i < arr.length - 1; i++) {
            int remaining = sum - arr[i];
            int lesserValueIndex = findLesserValueIndex(arr, i + 1, remaining);
            if (lesserValueIndex != -1) {
                count += lesserValueIndex - i;
            }
        }
        return count;
    }

    /**
     @param arr sorted array
     @param start starting index for scanning the array
     @param num number for which just lesser value needs to be found
     @return index at which value just lesser than num is present
     if not found return -1
     */
    public int findLesserValueIndex(int[] arr, int start, int num) {
        if(num < arr[start]) {
            return -1;
        }
        int low = start;
        int high = arr.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if( mid + 1 == arr.length || (arr[mid + 1] >= num && arr[mid] < num )) {
                return mid;
            } else if(arr[mid + 1] < num) {
                low = mid + 1;
            } else{
                high = mid - 1;
            }
        }

        return -1;
    }
}
