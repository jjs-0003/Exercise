package jp.co.jjs.java_seminar.exercise_20140519_1;

public class Main {
    public static void main(String[] args) {

        InportFile fileI = new InportFile();
        ExportFile fileO = new ExportFile();
        BookShelf bookshelf = new BookShelf();

        fileI.inFile("Book1.csv", bookshelf);
        bookshelf.show();

        fileO.outFile("Book2.csv", bookshelf.getList());
    }
}
