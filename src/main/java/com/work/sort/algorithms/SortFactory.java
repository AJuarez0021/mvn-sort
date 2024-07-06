package com.work.sort.algorithms;

/**
 *
 * @author linux
 */
public final class SortFactory {

    private SortFactory() {

    }

    public static SortBase createFactory(TypeSort type) {
        switch (type) {
            case BUBBLESORT -> {
                return new BubbleSort();
            }
            case INSERTSORT -> {
                return new InsertSort();
            }
            case QUICKSORT -> {
                return new QuickSort();
            }
            case SELECTIONSORT -> {
                return new SelectionSort();
            }
            case SHAKESORT -> {
                return new ShakeSort();
            }
            case SHELLSORT -> {
                return new ShellSort();
            }
            default -> throw new IllegalArgumentException("La opcion no es valida");
        }

    }
}
