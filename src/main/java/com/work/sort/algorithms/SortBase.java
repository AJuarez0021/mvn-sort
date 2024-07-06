package com.work.sort.algorithms;

/**
 *
 * @author linux
 */
public abstract class SortBase {

    public abstract void sort(int nums[]);

    public void print(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
