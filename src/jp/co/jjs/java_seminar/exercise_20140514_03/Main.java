package jp.co.jjs.java_seminar.exercise_20140514_03;

public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Book book1 = new Book(555,"java");
        Book book2 = new Book(666,"c++");
        Book book3 = new Book(777,"c");


        bookshelf.inBook(book1);
        bookshelf.inBook(book2);
        bookshelf.inBook(book3);

        bookshelf.showBook();

        bookshelf.outBook(555);
        
        System.out.println("取り出し後の本棚");
        bookshelf.showBook();
    }
}
