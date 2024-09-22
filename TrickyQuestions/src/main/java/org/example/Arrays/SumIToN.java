package org.example.Arrays;

import java.util.Scanner;

/*
Sum of 1 to N
Description
You are given a number, stored in a variable with the name N
Find the sum of al the numbers 1 to N
For example, if the value stored in N
1
2
3
4
5
Therefore, the sum becomes, sum =
s the required output
Input
then the sum of 1 to 5 is
15 which i
The first and the only line of input contains the number stored in the va riable N
 */
public class SumIToN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entre an number");
        int n= sc.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++){
            sum= sum+i;
        }
        System.out.println(sum);
    }
}
