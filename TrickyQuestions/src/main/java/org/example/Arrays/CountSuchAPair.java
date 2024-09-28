package org.example.Arrays;

import java.util.Scanner;

/*
Description
You are given an array A of N integers along with a target integer K .
Your task is to find out the number of pairs of integers present in the array,
whose sum is equal to the target value K
Input Format :
First line contains 2 integers: N and K.
Second line contains N space separated integers which are the elements of the array.
Constraints :
1 N 100
Output
Print the count of such pairs whose sum is K.
Smaple Input:
5 9
3 0 6 2 7
Sample Output
2
 */
public class CountSuchAPair {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int [] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      System.out.println(CountSuchPair(n,k,arr));
    }
    public  static int  CountSuchPair(int n ,int k, int[] arr){
        int count=0;
        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        return count;
    }

}
