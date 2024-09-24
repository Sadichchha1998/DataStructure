package org.example.TrickeyQuestion;

import java.util.Scanner;

public class TrickeyQuestion13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str1= "Stay inside";
        String str2= sc.nextLine();
        System.out.println(str1==str2);

    }
    /*
    If the user inputs "Stay inside", the program will likely print false,
     even though the contents of str1 and str2 are identical.
This happens because str1 is a string literal, which is stored in the string pool,
while str2 is a new String object created from user input.
They have the same content but different memory locations, so == returns false.

The correct way to compare string contents in Java is to use the .equals() method:
     */
}
