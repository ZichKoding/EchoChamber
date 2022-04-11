package com.company;

public class ArrayForLoop {
    public static void main(String[] args) {
        // int[] nums means array is going to be integers
        // new init[]{...} is initializing the array and the curly brackets are the items inside the array.
        int[] nums = new int[]{ 1, 2, 3, 4, 5, 6, 7 };

        System.out.println(nums);

        // for loop through the integer array to ensure what we did worked.
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(nums[i]);
        }

    }
}
