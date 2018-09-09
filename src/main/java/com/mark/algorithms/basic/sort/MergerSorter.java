package com.mark.algorithms.basic.sort;

/**
 * @Author: Administrator
 * @Date: 2018/9/8 0008
 */
public class MergerSorter implements  Sorter{

    private static Comparable[] aux;

    @Override
    public Comparable[] sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
        return a;
    }

    private static void sort(Comparable[] a, int low, int high) {
        if(high <= low) {
            return;
        }
        int middle = (low +high)/2;
        sort(a, low, middle);
        sort(a, middle + 1, high);
        SortHelper.merge(a, aux, low, middle, high);
    }
}
