package org.example.Arrays;

import java.util.Scanner;

public class IntersectionArray {
    public static void main(String args[] ){
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int [] arr1= new int [n];
        int []arr2= new int [n];
        for (int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        intersectionOFArray(n,arr1,arr2);

    }
    public static void intersectionOFArray(int n,int []arr1,int []arr2){

        int res= 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr1[i]==arr2[j]){
                    res= arr1[i];
                }
            }
        }
        System.out.println(res);
    }
}
