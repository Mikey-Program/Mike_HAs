package src.HA2;

public class main {
    public static void main(String[] args){

    //create test obejcts:
     Book book = new Book("x", 2000, "y");
     book.setTitle("Harry Potter");
     book.setYear(1997);
     book.setAuthor("J.K. Rowling");
     book.getInfo();
     System.out.println(book.getInfo());

     //create Textbook tests:
     Textbook textbook = new Textbook("x", 2000, "y", "z");
     textbook.setTitle("Harry Potter");
     textbook.setYear(1997);
     textbook.setAuthor("J.K. Rowling");
     textbook.setSubject("Magic");
     textbook.getInfo();
     System.out.println(textbook.getInfo());

    }
}
