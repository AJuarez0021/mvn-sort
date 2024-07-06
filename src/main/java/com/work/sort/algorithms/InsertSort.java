package com.work.sort.algorithms;

/**
 *
 * @author linux
 */
public class InsertSort extends SortBase {

    //Metodo de ordenacion - Insercion
    @Override
    public void sort(int[] nums) {
        int i;
        int j;
        int temp;
        for (i = 1; i < nums.length; ++i) {
            temp = nums[i];
            for (j = i - 1; (j >= 0) && (temp < nums[j]); j--) {
                nums[j + 1] = nums[j];
            }
            nums[j + 1] = temp;
        }
    }

}
