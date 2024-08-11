package maininheritance;

import inheritance.*;

public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.see();
        animal.smell();
        animal.breathe();
        System.out.println("Animals generally have "+animal.legs+" legs");
        System.out.println("----------------------------------------------------");
        Human human = new Human();
        human.think();
        human.talk();
        human.see();
        human.smell();
        human.breathe();
        human.legs =2;
        System.out.println("Human have "+human.legs+" legs");
        System.out.println("----------------------------------------------------");
        Dog dog = new Dog();
        dog.bark();
        dog.see();
        dog.smell();
        dog.breathe();
        dog.legs =4;
        System.out.println("Dog have "+dog.legs+" legs");
        System.out.println("----------------------------------------------------");
        Bird bird = new Bird();
        bird.fly();
        bird.see();
        bird.smell();
        bird.breathe();
        bird.legs =2;
        System.out.println("Bird have "+bird.legs+" legs");
        System.out.println("----------------------------------------------------");
        Fish fish = new Fish();
        fish.swim();
        fish.see();
        fish.smell();
        fish.breathe();
        fish.legs =0;
        System.out.println("Fish have "+fish.legs+" legs");
    }
}
