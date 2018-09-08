package com.mark.algorithms.basic.sort;

/**
 * @author: Mark Qin
 * @date: 2018/9/8 0008.
 */
public class ShellSorter implements Sorter {

    @Override
    public Comparable[] sort(Comparable[] a) {
        int len = a.length;
        int h = 1;
        int prime = 3;
        while (h < len/prime) {
            h = 3*h + 1;
        }
        while ( h>= 1) {
            for(int i = h; i< len; i++) {
                for(int j = i; j >=h && SortHelper.less(a[j], a[j-h]); j -= h) {
                    SortHelper.exchange(a, j, j-h);
                }
            }
            h=h/3;
        }
        return a;
    }
}
