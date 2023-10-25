package org.example;
/*
Класс описывающий сотрудников с почасовой оплатой
 */
public class Freelancer extends Employee{

    double ratePerHour; // поле значения ставки почасовой оплаты

    // конструктор для создания объекта класса
    public Freelancer(String name, String surname, int age, double ratePerHour) {
        super(name, surname, age);
        this.ratePerHour = ratePerHour;

    }
    // переопределенный метод расчета заработной платы среднемесячная заработная плата = 20.8 * 8 * почасовая ставка
    @Override
    public double salary() {
        return 20.8 * 8 * ratePerHour;
    }

    @Override
    public double getSalary() {
        return salary();
    }

    // переопределенный метод toString для вывода данных объекта в консоль
    @Override
    public String toString() {
        return String.format("%s: %s %s, возраст - %d, заработная плата - %.2f",
                getClass().getSimpleName(),
                getName(),
                getSurname(),
                getAge(),
                salary());
    }


}