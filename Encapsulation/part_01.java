package Encapsulation;

class BankAccount{
   private String name;

   public String getName(){
    return name;
   }

   public void setName(String name){
    this.name = name;
   }

}


public class part_01 {
    public static void main(String[] args) {
         BankAccount p1 = new BankAccount();
         p1.setName("Pravin");
         System.out.println("Account Holder name is: " + p1.getName());
    }
}
