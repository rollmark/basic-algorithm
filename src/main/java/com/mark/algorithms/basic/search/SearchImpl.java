package com.mark.algorithms.basic.search;

import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author: Mark Qin
 * @date: 2018/9/8 0008.
 */
public class SearchImpl implements Search {

    /**
     * Log2N
     * @param key
     * @param data
     * @return
     */
    @Override
    public int binarySearch(int key, List<Integer> data) {
        if(CollectionUtils.isEmpty(data)) {
            return -1;
        }
        int start = 0;
        int end = data.size() - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if(data.get(middle) < key ) {
                start = middle + 1;
            }else if (data.get(middle) > key){
                end = middle - 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
