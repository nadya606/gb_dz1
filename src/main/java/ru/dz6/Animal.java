package ru.dz6;

public abstract class Animal {
    String name;
    int runDistance;
    int swimDistance;
    final int maxRunLength;
    final int maxSwimLength;

    public Animal (String name,int runDistance, int swimDistance, int maxRunLength, int maxSwimLength) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
    }

   public void run(int runDistance) {
       if (runDistance <= maxRunLength) {
           System.out.println(name + " пробежал " + runDistance + " метров");
       } else {
           System.out.println(name + " не смог пробежать");
       }
   }

    public void swim(int swimDistance) {
           if (swimDistance <= maxSwimLength) {
               System.out.println(name + " проплыл " + swimDistance + " метров");
           } else {
               System.out.println(name + " не смог проплыть");
           }
       }

}



