package org.example.String;

import java.util.Scanner;

public class CharacterAtEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of string");
        int n = sc.nextInt();
        System.out.println("Enter String ");
        String str = sc.next();

        StringAtEvenPOstion(n, str);


    }

    private static void StringAtEvenPOstion(int n, String str) {
        String st="";
        for (int i = 0; i <=n-1; i++) {
            if (str.charAt(i) % 2 != 0) {
                st=st+str.charAt(i);
            }
        }
        System.out.println(st);


    }
}
