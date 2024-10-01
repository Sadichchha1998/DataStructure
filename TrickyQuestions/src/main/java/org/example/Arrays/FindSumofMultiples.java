package org.example.Arrays;

import java.util.Scanner;

/*
Description
You are given three integers: X, K, Y.
You have to print the sum of first K multiples of N,
on a condition that it should be divisible by Y.
Input
Input Format :
The input line contains 3 spaced integers Which are n,
k and y.
Constraints :
- 1000
1 Y 1000
IOA4
Output
Output the sum as mention in problem description.
Input :
3 10 5
Output:
45
Hint
Output Explanation :
For the sample input, X = 3, K = 10 and Y = 5
First K multiples of X are (First 10 multiples of 9 12 15 18 21 24 27 30
Numbers from above which are visible by Y (i.e 5) are:- 15, 30.
Sum of numbers divisible by 15 and 30 is 15+30 = 45.
 */
public class FindSumofMultiples {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int k= sc.nextInt();
        int y= sc.nextInt();
        FindSum(x,k,y);
    }
    public static void  FindSum(int x,int k,int y){

        int sum=0;
int n = 1;
        for(int  i= 1;i<=k;i++)
        {
            if(x==n*i)
            {
                if(x%y==0) ;
                {
                    sum=sum+x;
                }
            }
        }
        System.out.println(sum);

    }
            }

