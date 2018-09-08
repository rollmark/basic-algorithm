package com.mark.algorithms.basic.sort;

/**
 * @author: Mark Qin
 * @date: 2018/9/8 0008.
 */
public class InsertionSorter implements Sorter {

    @Override
    public Comparable[] sort(Comparable[] a) {
        for (int i=1; i<a.length; i++) {
            for(int j = i;j > 0 && SortHelper.less(a[j],a[j-1]); j--) {
                SortHelper.exchange(a, j, j-1);
            }
        }
        return a;
    }
}
