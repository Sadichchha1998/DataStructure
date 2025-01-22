package org.example.Arrays;

import java.util.Arrays;

public class PairSumTwoPointer {
    //pair sum
// Two Ponter Technique



        public static void main(String[] args) {
            int  [] arr= {1,2,3,4,5};
            int n= arr.length;
            int s= 5;
            Arrays.sort(arr);

            int left=0;
            int right = n-1;
            while(left <right){
                int sum= arr[left]+arr[right];
                if(sum==s){
                    System.out.println (arr[left]+","+arr[right]);
                    left ++;
                    right--;
                }
                else if(sum < s){
                    left++;
                }
                else {
                    right--;
                }
            }

        }
    }
