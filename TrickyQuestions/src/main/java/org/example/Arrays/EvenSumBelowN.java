package org.example.Arrays;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

/*
Description
You are given a number, stored in a variable with the name num
Find the sum of all even numbers greater than zero, and less than or equal to the value stored in num
For example, if the value stored in num = s , then all the even numbers smaller than or equal to 5, and greater than zero are
2
4
Therefore, the sum becomes, sum = 2 + 4 = 6 which is the required
output
Input
The first and the only line of input contains the number stored in the variable num
Output
Print the sum of all even numbers greater than zero, and less than or equal to the value stored in num
Sample Input 1
6
Sample Output 1
12
 */
public class EvenSumBelowN {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}
