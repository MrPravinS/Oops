package Abstract;

 abstract class Shape{
    abstract void area();

     void display(){
        System.out.println("Calculating Area...");
    }
 }
 
 class Rectangle extends Shape{
    float length = 12;
    float breadth = 10;

    void area(){
        System.out.println("Area Of the rectangle is :" + length * breadth);
    }

 }

 class Circle extends Shape{
    float radius = 3;
   

    void area(){
        System.out.println("Area Of the rectangle is :" + Math.PI * (radius * radius));
    }

 }

public class part_03 {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        Shape c = new Circle();
        r.area();
        c.area();
        r.display();
    }
}
