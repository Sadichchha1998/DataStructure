package org.example.Arrays;

import java.util.Scanner;
/*
Description
You are given a number, stored in a variable with the name num
Print all the odd numbers lesser than or equal to the value stored in nu
m
Only those numbers need to be printed which are greater than zero
For example: given that the value stored in num = 12
Therefore, the output will be
1
3
5
7
9
11
 */
public class Move2head {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre a number ...");
        int n= sc.nextInt();

        for (int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}
