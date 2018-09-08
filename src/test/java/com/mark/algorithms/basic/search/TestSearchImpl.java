package com.mark.algorithms.basic.search;

import com.mark.algorithms.basic.search.SearchImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/6 0006.
 */
@RunWith(MockitoJUnitRunner.class)
public class TestSearchImpl {

    @InjectMocks
    SearchImpl search;

    @Test
    public void testBinarySearch() {
        int key = 9;
        List data = new ArrayList();
        data.add(1);
        data.add(5);
        data.add(7);
        data.add(10);
        data.add(17);
        data.add(20);
        int index = search.binarySearch(key, data);
        Assert.assertEquals(index, -1);
    }
}
