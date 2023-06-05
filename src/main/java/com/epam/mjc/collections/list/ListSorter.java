package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {

    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {

        int aValue = calculateFunctionValue(a);
        int bValue = calculateFunctionValue(b);

        if (aValue != bValue) {
            return Integer.compare(aValue, bValue);
        } else {
            return a.compareTo(b);
        }
    }

    private int calculateFunctionValue(String numberStr) {
        int number = Integer.parseInt(numberStr);
        return 5 * number * number + 3;
    }
}
