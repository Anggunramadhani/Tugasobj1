package books;

public class Book {
    int no;
    String bookId;
    String title;
    String author;
    String category;
    int stock;
    int duration;


    public Book(int no,String bookId, String title, String author, String category, int stock,int duration) {
        this.no =no;
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;

    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


}

class StoryBook extends Book {
    public StoryBook(int no,String bookId, String title, String author, String category, int stock,int duration) {
        super(no,bookId, title, author, category, stock,duration);
    }
}

public class TextBook extends Book {
    public TextBook(int no,String bookId, String title, String author, String category, int stock,int duration) {
        super(no,bookId, title, author, category, stock,duration);
    }

 }
