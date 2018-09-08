package com.mark.algorithms.basic.sort;

/**
 * @author: Mark Qin
 * @date: 2018/9/8 0008.
 */
public class SelectionSorter implements Sorter {

    @Override
    public Comparable[] sort(Comparable[] a) {
        for(int i=0; i<a.length; i++) {
            int min = i;
            for(int j=i+1; j<a.length; j++) {
                if(SortHelper.less(a[j],a[min])) {
                    min = j;
                }
            }
            SortHelper.exchange(a, i, min);
        }
        return a;
    }
}
