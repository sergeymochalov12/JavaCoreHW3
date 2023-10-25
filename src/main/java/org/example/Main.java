package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        ComparatorName Name = new ComparatorName();
        ComparatorAge Age = new ComparatorAge();
        ComparatorSalary Salary = new ComparatorSalary();

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Worker("Сергей", "Мочалов", 42, 30000));
        employeeList.add(new Worker("Тимур", "Камильянов", 43, 30000));
        employeeList.add(new Worker("Лилия", "Гарипова", 43, 30000));
        employeeList.add(new Freelancer("Юлия", "Мочалова", 36, 500));
        employeeList.add(new Freelancer("Ринат", "Зарипов", 32, 400));
        employeeList.add(new Freelancer("Станислав", "Мощалкин", 32, 550));

        Personal personal = new Personal(employeeList);

               System.out.println("До сортировки: ");
        employeeList.forEach(System.out::println);

        System.out.println("\nПосле сортировки по имени: ");
        employeeList.sort(Name);
        employeeList.forEach(System.out::println);

        System.out.println("\nПосле сортировки по возрасту: ");
        employeeList.sort(Age);
        employeeList.forEach(System.out::println);

        System.out.println("\nПосле сортировки по зарплате: ");
        employeeList.sort(Salary);
        employeeList.forEach(System.out::println);

        personal.printPersonal();

    }
}