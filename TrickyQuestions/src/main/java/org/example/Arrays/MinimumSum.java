package org.example.Arrays;

import java.util.*;
/*
Description
Given an array of N integers. Find the minimum sum of K consecutive elements
Input
Input Format
The first line contains the number of testcases T
For each testcase, the first line contains the number N and K
The second line of each testcase consists of the elements of the array
sample Input:
2
5 3
9 9 -5 9 5
5 4
2 7 6 2 -5
Sample output:
9
10
 */
class MinimumSum
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int tc= sc.nextInt();
        while(tc-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            System.out.println(MinimumSum(n,k,arr));
        }
    } public static int MinimumSum(int n,int k,int arr[])
{
    if(n<k)
    {
        return -1;
    }

    int out=0;
    for(int i=0;i<k;i++)

        out+=arr[i];

    int sum=out;
    for(int i=k;i<n;i++)
    {
        sum=sum+arr[i]-arr[i-k];

        out=Math.min(out,sum);
    }
    return out;
}
}