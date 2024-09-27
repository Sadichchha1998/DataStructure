package org.example.Arrays;

import java.util.Scanner;

public class PairLessThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K value: ");
        int k = sc.nextInt();

        int result = PairLessThanK(n, arr, k);
        System.out.println(result);
    }

    public static int PairLessThanK(int n, int[] arr, int k) {
        int maxSum = -1;  // Initialize with -1 to handle the case when no valid pair exists

        // Loop to check every pair (i, j) where i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                // Check if the sum is less than K and is greater than the current maxSum
                if (sum < k && sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;  // If no pair found, maxSum remains -1
    }
}
