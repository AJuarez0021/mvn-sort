package com.work.sort;

import com.work.sort.algorithms.TypeSort;
import com.work.sort.algorithms.SortFactory;
import com.work.sort.algorithms.SortBase;
import java.util.Random;

/**
 *
 * @author linux
 */
public class Main {

    public static void main(String[] args) {
        int[] nums = readNums(10);
        SortBase sortBase = SortFactory.createFactory(TypeSort.BUBBLESORT);
        sort(sortBase, "==BubbleSort==", nums);

        nums = readNums(10);
        sortBase = SortFactory.createFactory(TypeSort.SHELLSORT);
        sort(sortBase, "==ShellSort==", nums);

        nums = readNums(10);
        sortBase = SortFactory.createFactory(TypeSort.INSERTSORT);
        sort(sortBase, "==InsertSort==", nums);

        nums = readNums(10);
        sortBase = SortFactory.createFactory(TypeSort.SHAKESORT);
        sort(sortBase, "==ShakeSort==", nums);

        nums = readNums(10);
        sortBase = SortFactory.createFactory(TypeSort.QUICKSORT);
        sort(sortBase, "==Quicksort==", nums);

        nums = readNums(10);
        sortBase = SortFactory.createFactory(TypeSort.SELECTIONSORT);
        sort(sortBase, "==SelectionSort==", nums);

    }

    private static int[] readNums(int max) {
        int[] nums = new int[max];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }
        return nums;
    }

    private static void sort(SortBase sortBase, String text, int[] nums) {
        System.out.println(text);
        System.out.println("Datos introducidos:");
        sortBase.print(nums);
        sortBase.sort(nums);
        System.out.println("Datos ordenados: ");
        sortBase.print(nums);
    }

}
