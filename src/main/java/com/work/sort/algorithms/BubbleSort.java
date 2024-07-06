package com.work.sort.algorithms;

/**
 *
 * @author linux
 */
public class BubbleSort extends SortBase {
    
    //Metodo de ordenacion - Burbuja
    @Override
    public void sort(int nums[]) {
        int i;
        int j;
        int temp;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = 1; j < nums.length; j++) {
                if (nums[j] < nums[j - 1]) {
                    temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }
}
