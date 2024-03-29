package com.company.util;

import com.company.base.People;

import java.util.Comparator;

public class SortedComparator implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        if(o2.getName().compareTo(o1.getName()) == 0){
            if (o1.getAge() - o2.getAge() == 0){
                return o2.getAge() - o1.getAge();
            }
            return o2.getName().compareTo(o1.getName());
        }
        return o2.getLastName().compareTo(o1.getLastName());
    }

}
