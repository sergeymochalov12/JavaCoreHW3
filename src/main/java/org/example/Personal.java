package org.example;

import java.util.List;

public class Personal {
    List<Employee> personal;

    public Personal(List<Employee> personal) {
        this.personal = personal;
    }

    public void printPersonal() {
        System.out.println("СПИСОК ВСЕХ СОТРУДНИКОВ ОРГАНИЗАЦИИ");
        for (Employee employee : personal) {
            System.out.println(employee);
        }


    }
}





