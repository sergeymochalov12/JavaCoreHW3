package org.example;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Employee> {

    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getAge() < e2.getAge()) {
            return -1;
        } else if(e1.getAge() > e2.getAge()) {
            return 1;
        }
        return 0;
    }
}