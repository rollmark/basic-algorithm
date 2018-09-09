package com.mark.algorithms.basic.sort;

/**
 * @Author: Administrator
 * @Date: 2018/9/9 0009
 */
public class QuickSorter implements Sorter {

    @Override
    public Comparable[] sort(Comparable[] a) {
        sort(a, 0, a.length-1);
        return a;
    }

    private static void sort(Comparable[] a, int low, int high) {
        if (high <= low) return;
        int j = SortHelper.partition(a, low, high);
        sort(a, low, j);
        sort(a, j+1, high);
    }
}
