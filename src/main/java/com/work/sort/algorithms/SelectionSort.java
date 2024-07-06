package com.work.sort.algorithms;

/**
 *
 * @author linux
 */
public class SelectionSort extends SortBase {

    //Metodo de ordenacion - Seleccion
    @Override
    public void sort(int[] nums) {
        int i;
        int j;
        int temp;
        int min;
        int indicemin;

        for (i = 0; i < (nums.length - 1); i++) {
            min = nums[i];
            indicemin = i;
            for (j = i + 1; j < nums.length; ++j) {
                if (nums[j] < min) {
                    min = nums[j];
                    indicemin = j;
                }
            }
            if (min < nums[i]) {
                temp = nums[i];
                nums[i] = min;
                nums[indicemin] = temp;
            }
        }
    }

}
