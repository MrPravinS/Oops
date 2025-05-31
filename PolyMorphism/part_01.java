package PolyMorphism;


class Calculator{
    int add(int a, int b){
        return a + b;
    }

    double add(double a,double b){
        return a + b;
    }

    int add(int a, int b,int c){
        return a + b + c;
    }
}

public class part_01 {
    public static void main(String[] args) {
        
        Calculator cl = new Calculator();
        cl.add(1,2);
        cl.add(1,2);
        cl.add(1,2,3);
        // System.out.println(cl.add());
        System.out.println(cl.add(1,2)+ " " +
        cl.add(1,2) +  " " +
        cl.add(1,2,3));
    }
     

}
