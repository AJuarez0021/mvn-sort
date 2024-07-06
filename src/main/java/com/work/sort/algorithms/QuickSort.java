package com.work.sort.algorithms;

/**
 *
 * @author linux
 */
public class QuickSort extends SortBase {

    private void qs(int iNums[], int inf, int sup) {
        int izq; 
        int der;
        int mitad;
        int x;

        izq = inf;
        der = sup;
        mitad = iNums[(izq + der) / 2];
        do {
            while (iNums[izq] < mitad && izq < sup) {
                izq++;
            }
            while (mitad < iNums[der] && der > inf) {
                der--;
            }

            if (izq <= der) {
                x = iNums[izq];
                iNums[izq] = iNums[der];
                iNums[der] = x;
                izq++;
                der--;
            }

        } while (izq <= der);
        if (inf < der) {
            qs(iNums, inf, der);
        }
        if (izq < sup) {
            qs(iNums, izq, sup);
        }
    }

    //Metodo de ordenacion - Quicksort
    @Override
    public void sort(int[] nums) {
        qs(nums, 0, nums.length - 1);
    }

}
