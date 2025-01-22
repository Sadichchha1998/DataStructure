package org.example.Arrays;

import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int  [] arr= {2,-3,3,3,-2};
        int n= arr.length;
        int s= 0;
        Arrays.sort(arr);

        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==s){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }

    }
}
