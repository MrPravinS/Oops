package Encapsulation;


class BankAccountt{
    private String name;
    private double balance;


    public void setName(String name){
        this.name = name;
    }

    public void setBalance(double ammount){
        if(ammount >= 0){
            this.balance = ammount;
        }else{
            System.out.println("Invalid Balance");
        }
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }
}
public class part_02 {
     public static void main(String[] args) {
        BankAccountt p1 = new BankAccountt();
        p1.setName("Pravin");
        p1.setBalance(2000000);

        System.out.println("Account Holder: " + p1.getName() + "\n Balance : "+ p1.getBalance());
     }
}
