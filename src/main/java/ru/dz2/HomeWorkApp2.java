package ru.dz2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        System.out.println(summuryNumbers(a,b));

        isPositiveOrNegative(5);

        System.out.println(isNegative(-10));

        printWordNTimes("result ", 8);
    }

    public static boolean summuryNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10) {
            return true;
        }if (sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (0 <= x) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if (0 >= x) {
            return true;
        }
        return false;
    }

    public static void printWordNTimes(String word, int times) {
       for (int i = 0; i < times; i++) {
           System.out.println(word);
        }

    }

    }
