package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 2; i < sourceList.size(); i += 3) {
            String word = sourceList.get(i);
            arrayList.add(word);
            arrayList.add(word);
        }

        return arrayList;
    }
}