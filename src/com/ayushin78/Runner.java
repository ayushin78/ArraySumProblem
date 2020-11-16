package com.ayushin78;

import java.util.Scanner;

public class Runner {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array");
        int num = scanner.nextInt();

        System.out.println("Enter array elements");
        int[] arr = new int[num];
        for(int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Enter K");
        int k = scanner.nextInt();

        ArraySum arraySum = new ArraySum();
        int count = arraySum.countPairsWithLesserSum(arr, k);
        System.out.println("Count of pairs with sum lesser than k(" + k + ") : " + count);
    }
}
