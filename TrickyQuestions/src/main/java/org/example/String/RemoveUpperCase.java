package org.example.String;

import java.util.Scanner;

public class RemoveUpperCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        String str= sc.next();
        RemoveUpperCase(n,str);

    }
    public  static void RemoveUpperCase(int n, String str ){
        String low="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<low.length();j++){
                if(str.charAt(i)==low.charAt(j)){
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
    }
