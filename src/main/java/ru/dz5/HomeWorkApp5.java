package ru.dz5;

import com.sun.org.apache.xalan.internal.xsltc.dom.MultiValuedNodeHeapIterator;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Workers[] persArray = new Workers[5];
        persArray[0] = new Workers("Ivanov Ivan", "junior manager", "ivan@mail.ru", "+79991234567", 30000, 25);
        persArray[1] = new Workers("Petrov Petr", "project manager", "petr@mail.ru", "+79991234568", 50000, 40);
        persArray[2] = new Workers("Semenov Semen", "developer", "semen@mail.ru", "+79991234569", 80000, 45);
        persArray[3] = new Workers("Sergeev Sergey", "tester", "sergey@mail.ru", "+79991234556", 60000, 35);
        persArray[4] = new Workers("Malov Alexey", "account", "alexey@mail.ru", "+79991234558", 55000, 30);

        int i;
        for (i = 0; i < persArray.length; i++)
            if (persArray[i].age >= 40) {
                persArray[i].info();
            }

        persArray[4].info();
    }
}













