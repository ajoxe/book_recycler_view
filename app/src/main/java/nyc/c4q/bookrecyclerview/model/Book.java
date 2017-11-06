package nyc.c4q.bookrecyclerview.model;

/**
 * Created by amirahoxendine on 11/5/17.
 */

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private String publishingYear;
    private int bookCover;

    public Book(int bookCover, String title, String author, String publishingYear) {
        this.bookCover = bookCover;
        this.bookTitle = title;
        this.bookAuthor = author;
        this.publishingYear = publishingYear;

    }

    public int getBookCover() {
        return bookCover;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getPublishingYear() {
        return publishingYear;
    }
}
