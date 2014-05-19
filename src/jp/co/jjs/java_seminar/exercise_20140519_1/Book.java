package jp.co.jjs.java_seminar.exercise_20140519_1;

public class Book {

    private String title;
    private String isbn;
    private String author;
    private String publisher;
    private int price;

    public Book(String title, String isbn, String author, String publisher,
            int price) {

        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
        this.price = price;

    }

    /*
     * (非 Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return title + "," + isbn + "," + author + "," + publisher + ","
                + price;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     *            セットする title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn
     *            セットする isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author
     *            セットする author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher
     *            セットする publisher
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price
     *            セットする price
     */
    public void setPrice(int price) {
        this.price = price;
    }

}
