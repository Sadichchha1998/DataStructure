package org.example.String;

import java.util.Scanner;

public class DetectPalindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
String reversed= new StringBuilder(str)
        .reverse() // Use StringBuilder to reverse
        .toString(); // Convert back to String
        if(str.equals(reversed)){
            System.out.println( str+" is palindrome");
        }else {
            System.out.println(str+" is not palindrome");
        }
    }

}
