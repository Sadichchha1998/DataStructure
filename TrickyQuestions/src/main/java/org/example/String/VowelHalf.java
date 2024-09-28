package org.example.String;

import java.util.Scanner;

/*
Vowel Half
Description

• You are given a string, stored in a variable with the name str .
The size of the string is stored in a variable N
• The string contains only small case English alphabets
• You have to print True , if more than half the characters in the strings are vowels,
else print False
• For example, consider the value stored in
N= 6 and str =" aabefe"
 The number of vowels in the string are 4 , which is more
than half of the length of the string, which is N/2 = 3 .
Therefore, the required output is True
Note : The value stored in N, will always be even
Input
• The first line of the input contains the value stored in N
• The next line contains the value stored in str
 */

import java.util.Scanner;
    public class VowelHalf {
        public static void vowelHalf(int N, String str) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    count++;
                }
            }

            if (count > N / 2) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            sc.nextLine();  // Consume the leftover newline character
            String str = sc.nextLine();

            vowelHalf(N, str);
        }
    }

