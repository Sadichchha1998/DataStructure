package org.example.Prime;

import java.util.Scanner;

/*
Description
• You are given a number stored in a variable with the name num
• Check if the number is a prime number or not
If the value stored in num is a prime number print Yes , else print
No
Note .
A prime number is a number, that is divisible by only 1 and the number itself
 */
public class IdentifyPrimeNum {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Entre a number to check whether it is prime or not");
        int n= sc.nextInt();
        int count=0;
        for (int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("yes this is the prime number"+n);
        }else{
            System.out.println("No this is not prime Number"+n);
        }

    }
}
