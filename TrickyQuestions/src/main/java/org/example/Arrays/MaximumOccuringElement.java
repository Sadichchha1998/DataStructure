package org.example.Arrays;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumOccuringElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            maximumAccoring(n,arr);
        }
    }

    private static void maximumAccoring(int n, int[] arr) {
        Map<Integer,Integer> hp= new HashMap<Integer,Integer>();
        for (int i=0;i<n;i++){
            int key=arr[i];
            if(hp.containsKey(key)){
                int freq=hp.get(key);
                freq++;
                hp.put(key,freq);
            }else{
                hp.put(key,1);
            }
        }
        int max_count=0;
        int res=-1;
        for(Map.Entry<Integer,Integer>val:hp.entrySet()){
            if (max_count<val.getValue()){
                res=val.getKey();
                max_count= val.getValue();
            }
        }
    }
}
