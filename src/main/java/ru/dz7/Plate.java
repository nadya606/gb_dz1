package ru.dz7;

public class Plate {
    private int food;

    Plate(int food) {
    this.food = food;
    }

    //1.	Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
    /*public void decreaseFood(int appetite) {
        this.food -= appetite;
    }*/

    /*public void decreaseFood(int appetite) {
        if (food > appetite) {
            System.out.println("Мало еды");
        }
        else {
            food -= appetite;
        }
    }*/

    public boolean decreaseFood(int appetite) {
        if (!muchFood(appetite)) {
        System.out.println("Не хватило еды");
        return false;
        }
        else {
        food = food - appetite;
        return true;
        }
    }

    public boolean muchFood(int appetite) {
         return appetite < food;
    }

    //5. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
    void addFood(int newfood) {
        food += newfood;
    }

    public void info() {
        System.out.println("Plate " +food);
    }
}
