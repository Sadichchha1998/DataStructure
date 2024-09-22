package org.example.Arrays;

import java.util.Scanner;

/*
Description
• You are given two numbers stored in the variable with the following names,
num, K
• You have to print all the numbers in the range [l,num] , such that for each number,
the operation i % K that is where i refers the numbers present in that range
• Print each number on a new line
Input
The first and the only line of input contains two values, stored in num,
K respectively
Output
• You have to print all the numbers in the range [l,num] such that
for each number, the operation i % K e w, where i refers to th
e numbers present in that range
Sample Input 1  7 2
Sample Output 1
2
4
6
 */
public class DivisiablwByK {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();

        for (int i=1;i<=n;i++){
            if (i%k==0){
                System.out.println(i);
            }
        }
    }
}
