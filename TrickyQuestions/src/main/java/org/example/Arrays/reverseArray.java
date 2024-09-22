package org.example.Arrays;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Entre sze of an array");
        int [] arr= new int [n];
        System.out.println("Entre element of an array");
        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("array in as it order");
        for(int i: arr){
            System.out.println(i);
        }
System.out.println("array in the reverse order");
        for (int j =n-1; j>=0;j--){
            System.out.println(arr[j]);
        }
    }
}
