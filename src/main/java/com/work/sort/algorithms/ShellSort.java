package com.work.sort.algorithms;

/**
 *
 * @author linux
 */
public class ShellSort extends SortBase {

    //Metodo de ordenacion - Shell
    @Override
    public void sort(int[] nums) {
        int i;
        int j;
        int temp;
        int x;
        int a[] = new int[5];

        a[0] = 9;
        a[1] = 5;
        a[2] = 3;
        a[3] = 2;
        a[4] = 1;
        for (int k = 0; k < 5; k++) {
            temp = a[k];
            for (i = temp; i < nums.length; ++i) {
                x = nums[i];
                for (j = i - temp; (j >= 0) && (x < nums[j]); j = j - temp) {
                    nums[j + temp] = nums[j];
                }

                nums[j + temp] = x;
            }
        }
    }

}
