package Inhertance;

class Employee{
    String name;
    double salary;

    void showDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Salary: "+ salary);
    }
}

class Manager extends Employee{
    String department;

    void showManagerDetails(){
        showDetails();
        System.out.println("Department: "+ department);
    }
}


public class part_02 {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.name = "Pravin ";
        m1.salary = 150000;
        m1.department = "Product ";
        m1.showManagerDetails();
        System.out.println();

        m1.name = "Ajay";
        m1.salary = 200000;
        m1.department = "HR";
        m1.showManagerDetails();
    }
    
}
