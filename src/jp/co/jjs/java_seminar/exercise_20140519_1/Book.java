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

}
