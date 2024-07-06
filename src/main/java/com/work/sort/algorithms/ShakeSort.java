package com.work.sort.algorithms;

/**
 *
 * @author linux
 */
public class ShakeSort extends SortBase {

    //Metodo de ordenacion - Sacudida
    @Override
    public void sort(int[] nums) {
        int i;
        int temp;
        boolean inter;
        do {
            inter = false;
            for (i = nums.length - 1; i > 0; --i) {
                if (nums[i - 1] > nums[i]) {
                    temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                    inter = true;
                }
            }
            for (i = 1; i < nums.length; ++i) {
                if (nums[i - 1] > nums[i]) {
                    temp = nums[i - 1];
                    nums[i - 1] = nums[i];
                    nums[i] = temp;
                    inter = true;
                }
            }
        } while (inter);
    }

}
