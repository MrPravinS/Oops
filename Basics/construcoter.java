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
        title = "Unknown";
        author = "anonymous";
        price = 0;
    }

    Book(String t, String a, float p){
       title = t;
       author = a;
       price = p;
    }

    void displayBookDetails(){
        System.out.println("Title:" + title + "\nAutor : " + author + " \nprice: "+ price );
    }
}