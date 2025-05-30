package Basics;

public class construcoter {
    public static void main(String[] args) {
        Book book = new Book();
        Book book2 = new Book("Atomic Habit","James clear",45);

        book.displayBookDetails();
        book2.displayBookDetails();

    }
}




class Book{
    String title;
    String author;
    float price;

    Book(){
        this("laws of power", "Pravin", 0);   // calls another constructor
    }
    // Book(){
    //     this.title = "Unknown";
    //     this.author = "anonymous";
    //     this.price = 0;
    // }

    Book(String t, String a, float p){
       this.title = t;    // this keywork refers to the current object of the class
       this.author = a;
       this.price = p;
    }

    void displayBookDetails(){
        System.out.println("Title:" + title + "\nAutor : " + author + " \nprice: "+ price );
    }
}