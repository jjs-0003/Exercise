package jp.co.jjs.java_seminar.exercise_20140514_1;

public class Book {
    int id; // 本のID
    String title; // 名前
    String author; // 著者
    String publisher; // 出版社
    int price; // 値段
    boolean stock = true; // 在庫

    // 在庫がなくなる
    public void stockLost() {
        stock = false;
    }

    // 入荷する
    public void stockArrive() {
        stock = true;
    }
}
