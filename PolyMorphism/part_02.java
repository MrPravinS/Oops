package PolyMorphism;

/* 
class Animal{
    void makeSound(){
        System.out.println("Some Sound");
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println("Dog SOund");
    }
}


public class part_02 {
    public static void main(String[] args) {
        Animal al = new Dog();
        al.makeSound();
        // System.out.println(al.makeSound());
    }
}

*/


class Print{
   String print(String s){
    return "Pravin";
   }

   int print(int n){
    return n;
   }

   void print(String s, int n){
      System.out.println(s + " " + n);
   }
}

public class part_02 {
  public static void main(String[] args) {
        // Print p = new Print();
        // int a = p.print(2);
        // String b = p.print("Pravin");
        // System.out.println(a + " " + b );
        // p.print("Pravin", 34);

        Shape s2 = new Circle();
        Shape s1 = new Square();
        s2.draw();
        s1.draw();
    }
}


class Shape{
    void draw(){
        System.out.println("Drawing Something...");
    }
}


class Circle extends Shape{
    void draw(){
        System.out.println("Draawing circle...");
    }
}


class Square extends Shape{
    void draw(){
        System.out.println("Draawing Sqaure...");
    }
}

