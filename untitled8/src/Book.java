public class Book {
    int bookId;
    String title;
    String author;
    String category;
    int stock;
    int duration;

    public Book(int bookId, String title, String author, String category, int stock, int duration) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.stock = stock;
        this.duration = duration;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }


}

class HistoryBook extends Book {
    public HistoryBook(int bookId, String title, String author, String category, int stock, int duration) {
        super(bookId, title, author, category, stock, duration);
    }
}

class StoryBook extends Book {
    public StoryBook(int bookId, String title, String author, String category, int stock, int duration) {
        super(bookId, title, author, category, stock, duration);
    }
}

class TextBook extends Book {
    public TextBook(int bookId, String title, String author, String category, int stock, int duration) {
        super(bookId, title, author, category, stock, duration);
    }
}