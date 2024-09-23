package org.example.Arrays;

import java.util.Scanner;
/*
Maximum in array
Description
Ended
• You are given an array, stored in a variable with the size arr
• The size of the array is stored in a variable with the name n
• You have to find the maximum number in the array
• For example, consider the array as arr
[1 2 3 4 5), and the
value stored in n =
• Then, the required output will be s , as it is the largest number in the array
Input
The first line of the input contains the value stored in N the size of the
array
The next line contains N space separated numbers denoting the elements of the array
 */
public class MaximumInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int []arr= new int[n];
      for (int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      findMaximum(n,arr);
    }

    private static void findMaximum(int n, int[] arr) {
        //int max=0;
        int max=Integer. MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
