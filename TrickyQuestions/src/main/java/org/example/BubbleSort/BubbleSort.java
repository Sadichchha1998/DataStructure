package org.example.BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int nums[] = {6, 7, 8, 3, 4};
        int size = nums.length;
        int temp = 0;
        System.out.println("Before Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                //we have to compare two value with the adjustant element
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j + 1] = temp;
                }
            }

        }
        System.out.println();
        System.out.println("Afore Sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
}
