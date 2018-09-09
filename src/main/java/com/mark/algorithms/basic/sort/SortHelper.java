package com.mark.algorithms.basic.sort;

/**
 * @author: Mark Qin
 * @date: 2018/9/8 0008.
 */
public class SortHelper {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0 ;
    }

    public static void exchange(Comparable[] a, int i, int j) {
        if(a[i] != a[j]) {
            Comparable t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }

    public static void merge(Comparable[] a, Comparable[] aux, int low, int middle, int high) {
        show(a);
        int i = low;
        int j = middle + 1;
        //copy from a to aux
        for(int k = low; k <= high; k++) {
            aux[k] = a[k];
        }
        show(aux);
        for(int k= low; k <= high; k++) {
            if(i > middle) {
                a[k] = aux[j++];
            }else if (j > high) {
                a[k] = aux[i++];
            }else if (less(aux[j], aux[i])) {
                a[k] = aux[j++];
            }else {
                a[k] = aux[i++];
            }
        }
        show(a);
    }

    public static boolean isSorted(Comparable[] a) {
        for(int i=1; i < a.length; i++) {
            if (less(a[i],a[i-1])) {
                return false;
            }
        }
        return true;
    }

    public static void show(Comparable[] a) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.length; i++) {
            sb.append(a[i] +" ");

        }
        System.out.println(sb.toString());
    }
}
