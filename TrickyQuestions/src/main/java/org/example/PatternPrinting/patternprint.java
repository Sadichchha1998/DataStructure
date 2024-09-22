package org.example.PatternPrinting;

import java.util.Scanner;

/*
Description
You are given a number stored in a variable with the name N
Print the pattern as shown below.
If the value stored in N = 4 then the pattern required will be
*
**
***
****
 */
public class patternprint {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Entre number to print this pattern");
        int n= sc.nextInt();

        for (int i=0;i<=n;i++){
            for (int j=0;j<=i;j++) {


                System.out.print("*");
            }
            System.out.println();
        }
    }
}
