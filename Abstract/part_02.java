package Abstract;

 interface Vehicle {
   void start();
   void drift();
    
}

class Car implements Vehicle{
   public void start(){
        System.out.println("Car Starts");
    }

   public void drift(){
        System.out.println("Car Drifting...");
    }
}

public class part_02 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drift();
    }
}
