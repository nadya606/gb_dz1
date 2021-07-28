package ru.dz1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 5;
        int c = a + b;
        if (c >= 10) {
            System.out.println("Сумма положительная");
        }
        if (c < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int myValue = 66;
        if (myValue < 0) {
            System.out.println("Красный");
        }
        else if (myValue > 100) {
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }
    }
    public static void compareNumbers() {
        int a = 6;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}

