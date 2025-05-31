package Inhertance;


class Animal{
   void makeSound(){
    System.out.println("Make Some sound");
   }


}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog Barking...");
    }
}

public class part_01 {
 public static void main(String[] args) {
    Dog d = new Dog();
    d.makeSound();  // inherited from Animal
    d.bark();   // define in dog
 }
    
}