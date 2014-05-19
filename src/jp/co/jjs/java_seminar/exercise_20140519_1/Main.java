package jp.co.jjs.java_seminar.exercise_20140519_1;

public class Main {
    public static void main(String[] args) {

        String[] bookif = new String[4];
        InportFile fileI = new InportFile();
        BookShelf bookshelf = new BookShelf();

        fileI.inFile(bookif, bookshelf);
        bookshelf.show();
    }
}
