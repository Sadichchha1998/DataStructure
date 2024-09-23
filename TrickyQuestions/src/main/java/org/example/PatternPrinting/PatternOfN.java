package org.example.PatternPrinting;

import java.util.Scanner;

/*
Pattern of N

• You are given a number stored in a variable with the name N
• You have to print all the numbers in the range from 1 to su
ch that there are exactly N numbers on each line
• For example, if the value stored in N= 3 , then all the numbers in
the range, from [1 need to be printed, such that there are 3 numbers on each line.
Therefore, the required output is
1 2 3
4 5 6
7 8 9
 */
public class PatternOfN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        for(int i=0;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i*n+j+" ");
            }
            System.out.println();
        }
    }
}
