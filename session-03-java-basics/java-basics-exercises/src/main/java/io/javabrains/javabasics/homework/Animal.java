package io.javabrains.javabasics.homework;

public class Animal {
    String name;
    int age;
    int weight;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

class Lion extends Animal{
    public static void display(String name){
        System.out.println("Lion name: " + name);
    }
}

class Tiger extends Animal {
    public static void display(String name){
        System.out.println("Tiger name: " + name);
    }
}

class Dog extends Animal {
    public static void display(String name){
        System.out.println("Dog name: " + name);
    }
}
