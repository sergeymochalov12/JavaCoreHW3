package org.example;
/*
Абстрактный класс описывающий объект сотрудник
 */
public abstract class Employee {

    private String name;// имя сотрудника
    private String surname;// фамилия сотрудника
    private int age;// возраст сотрудника


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return this.age;
    }
    // конструктор для создания объекта
    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    // абстрактный метод (без тела) расчета заработной платы
    public abstract double salary();
    public  abstract double getSalary();
}