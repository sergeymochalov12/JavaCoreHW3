package org.example;
/*
Класс описывающий объект рабочий с фиксированной заработной платой
 */
public class Worker extends Employee{

    private double salary; // поле значения величины заработной платы

    /*
    Конструктор для создания объекта рабочий с фиксированной заработной платой
     */
    public Worker(String name, String surname, int age, double salary) {
        super(name, surname, age);
        this.salary = salary;
    }
    // метод получения значения заработной платы среднемесячная заработная плата = фиксированная месячная оплата
    @Override
    public double salary() {
        return this.salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
    // переопределенный метод toString для вывода данных объекта в консоль

    @Override
    public String toString() {
        return String.format("%s: %s %s, возраст - %d, заработная плата - %.2f",getClass().getSimpleName(), getName(), getSurname(), getAge(), salary());
    }
}