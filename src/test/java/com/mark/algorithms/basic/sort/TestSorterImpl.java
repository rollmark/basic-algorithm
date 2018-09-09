package com.mark.algorithms.basic.sort;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * @author: Mark Qin
 * @date: 2018/9/8 0008.
 */

@RunWith(MockitoJUnitRunner.class)
public class TestSorterImpl {

    @InjectMocks
    private SelectionSorter selectionSorter;

    @InjectMocks
    private InsertionSorter insertionSorter;

    @InjectMocks
    private ShellSorter shellSorter;

    @InjectMocks
    private MergerSorter mergerSorter;

    public String[] initData() {
        String[] a = new String[16];
        a[0] = "S";
        a[1] = "H";
        a[2] = "E";
        a[3] = "L";
        a[4] = "L";
        a[5] = "S";
        a[6] = "O";
        a[7] = "R";
        a[8] = "T";
        a[9] = "E";
        a[10] = "X";
        a[11] = "A";
        a[12] = "M";
        a[13] = "P";
        a[14] = "L";
        a[15] = "E";
        return a;
    }

    @Test
    public void testSelectionSorter() {
        String [] a = initData();
        Assert.assertTrue(SortHelper.isSorted(selectionSorter.sort(a)));
        SortHelper.show(a);
    }

    @Test
    public void testInsertionSorter() {
        String[] a = initData();
        Assert.assertTrue(SortHelper.isSorted(insertionSorter.sort(a)));
        SortHelper.show(a);
    }

    @Test
    public void testShellSorter() {
        String [] a = initData();
        Assert.assertTrue(SortHelper.isSorted(shellSorter.sort(a)));
        SortHelper.show(a);
    }

    @Test
    public void testMergerSorter() {
        String [] a = initData();
        Assert.assertTrue(SortHelper.isSorted(mergerSorter.sort(a)));
        SortHelper.show(a);
    }
}
