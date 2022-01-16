// Create a pacakge 'book' and place both the classes in them!!
// book Class

package book;

public class Book {
  private  String title, author;
  private  int year, pages;
  private  boolean borrow;



    public Book (String title, String author, int year, int pages, boolean borrow) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
        this.borrow = borrow;
    }

    public Book (Book b) {
        if (b == null) {
            throw new IllegalArgumentException("Invalid Reference!!");
        }

        title = b.title;
        author = b.author;
        year = b.year;
        pages = b.pages;
        borrow = b.borrow;
    }
    @Override
    public String toString() {
        String bookData = "Title: " + title + " Author: " + author + " Year: " + year + " Pages: " + pages + " Borrow: " + borrow;
        return bookData;
    }
    
    public boolean sameAs (Book b) {
        if (title == b.title && author == b.author && year == b.year && pages == b.pages) {
            return true;
        }
        else {
            return false;
        }    
    }
 
}

// bookMain Class

package book;

public class BookMain {
   public static void main(String [] args) {
        Book a = new Book("Java", "Anees Umer", 2021, 320, true);
        Book b = new Book("C++", "Ali Azeem", 2018, 120, false);
        Book c = new Book(a);

        System.out.println(a.sameAs(c));
        System.out.println(a.sameAs(b));
        System.out.println(c);

     
   }
}
