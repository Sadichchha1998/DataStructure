package org.example.SelectionSort;

public class SelectionSort {
    public static void main(String[] args) {
                int nums[] = {6, 7, 8, 3, 4};
                int size = nums.length;
                int temp=0;
                int minIndex = -1;
                System.out.println("Before Sorting");
                for (int num : nums) {
                    System.out.print(num + " ");
                }

                for (int i = 0; i < size-1; i++) {
                    minIndex=i;
                    for (int j = i; j < size; j++) {

                        if (nums[minIndex] > nums[j ]) {
                            minIndex = nums[j];
                            minIndex=j;
                        }
                        temp=nums[minIndex];
                        nums[minIndex]=nums[i];
                        nums[i]=temp;
                    }

                }
                System.out.println();
                System.out.println("Afore Sorting");
                for (int num : nums) {
                    System.out.print(num + " ");
                }

            }
        }
