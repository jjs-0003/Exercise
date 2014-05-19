package jp.co.jjs.java_seminar.exercise_20140519_1;

public class Main {
    public static void main(String[] args) {

        InportFile fileI = new InportFile();
        BookShelf bookshelf = new BookShelf();

        fileI.inFile(bookshelf);
        bookshelf.show();
    }
}
