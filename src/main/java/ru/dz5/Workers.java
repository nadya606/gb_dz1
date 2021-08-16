package ru.dz5;

public class Workers {
    //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
    String name;
    String position;
    String email;
    String number;
    float salary;
    int age;


    //Конструктор класса должен заполнять эти поля при создании объекта.
    public Workers(String name, String position, String email, String number, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    void info() {
        System.out.println(name + " " + position + " " + email + " " + number + " " + salary + " " + age + " ");
    }



}
