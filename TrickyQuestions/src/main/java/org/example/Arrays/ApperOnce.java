package org.example.Arrays;

import java.util.HashMap;
import java.util.Scanner;

/*
Description
• You are given an array, whose size is stored in a variable with the name N
• The array is stored in a variable with the name arr
• You have to find the sum of all the elements of the array which are unique.
• For exampler consider the value stored in N= 7 and the value stored in arr =
. Since there are two numbers th
at are unique i-e 8 and 6.
• Then the required output will be 8+6 = 14 , which is the required
output
 */
public class ApperOnce {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        ApperOnce(n,arr);
    }
    public  static void ApperOnce(int n, int [] arr){
        HashMap<Integer,Integer> hm= new HashMap<>();
        for (int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                int a= hm.get(arr[i]);
                hm.put(arr[i],a+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        //System.out.println(map);
        int sum=0;
        for(int i:hm.keySet()){
            if(hm.get(i)==1){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    }