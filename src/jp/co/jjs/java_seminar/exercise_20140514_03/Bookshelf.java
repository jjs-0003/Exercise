package jp.co.jjs.java_seminar.exercise_20140514_03;

//  本棚を表現するクラス(本が複数格納されている)
public class Bookshelf {
    int bookMax = 100; // 本の最大格納数
    int bookCount;
    Book[] bookArray = new Book[bookMax]; // Book型の配列

    // 本棚に本を入れる
    public void inBook(Book book) {
        bookArray[this.bookCount] = book;
        this.bookCount++;
    }

    // 格納した全ての本のIDとタイトルの表示
    public void showBook() {
        for (int i = 0; i < this.bookCount; i++) {
            System.out.println("ID: " + this.bookArray[i].id + " Title: "
                    + this.bookArray[i].title);
        }
    }

    // 指定したIDの本を取り出す
    public void outBook(int id) {
        int i;
        for (i = 0; i < this.bookCount; i++) {
            if (this.bookArray[i].id == id) {
                System.out.println("取り出した本");
                System.out.println("ID: " + this.bookArray[i].id + " Title: "
                        + this.bookArray[i].title);
                break;
            }
        }
        for (; i < this.bookCount - 1; i++) {
            this.bookArray[i] = this.bookArray[i + 1];
        }
        this.bookCount--;
    }
}
