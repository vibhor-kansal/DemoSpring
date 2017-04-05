package com.demospring.processing.hackerrank;

class Food {
    String name;

    public void serveFood() {
        // TODO Auto-generated method stub
        System.out.println("I'm serving " + name);
    }
}

class FoodFactory extends Food {
    String name;

    public Food getFood(String string) {
        if (string.equals("FastFood")) {
            Food f = new FastFood();
            f.name = string;
            return f;
        } else {
            Food f = new Fruit();
            f.name = string;
            return f;
        }
    }
}

class FastFood extends Food {
}

class Fruit extends Food {
    String res[] = null;
}

class Solution {
    public static void main(String[] args) {
        FoodFactory myFoods = new FoodFactory();
        Food food1 = myFoods.getFood("FastFood");
        Food food2 = myFoods.getFood("Fruit");
        System.out.println("My name is: " + food1.getClass().getName());
        System.out.println("My name is: " + food2.getClass().getName());
        System.out.println("Our superclass is: " + food1.getClass().getName());//modification
        food1.serveFood();
        food2.serveFood();
    }
}