package Basics;
/* 
class Car {
    String color;
    int speed;

    void drive() {
        System.out.println("Car Is driving... " + speed + "Km/hr");
    }
}

public class Basics {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Black";
        myCar.speed = 200;

        System.out.println("Color Of the car is : " + myCar.color);
        myCar.drive();
    }
}
*/


class Student{
    String name;
    int age;
    String grade;

    Student(){
        name = "unknown";
        age = 0;
        grade = "F";

    }

   Student(String n, int a, String g){
      this.name = n;
      this.age = a;
      this.grade = g;
   }

    void displayInfo(){
        System.out.println("Student Name : " + name + " \nAge: "+ age + "\nGrade : " + grade);
    }
}

public class Basics {
 public static void main(String[] args) {
     Student student1 = new Student();
     Student student2 = new Student();
     Student student3 = new Student("Nandani",7,"B+");
     student1.name = "Pravin";
     student1.age = 22;
     student1.grade = "A+";

     student2.name = "Ajay";
     student2.age = 23;
     student2.grade = "A";


     student1.displayInfo();
     student2.displayInfo();
     student3.displayInfo();


 }
    
}


