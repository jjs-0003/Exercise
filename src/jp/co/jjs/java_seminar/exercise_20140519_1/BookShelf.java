package jp.co.jjs.java_seminar.exercise_20140519_1;

import java.util.ArrayList;

public class BookShelf {

    private ArrayList<Book> list = new ArrayList<>();


    public void add(Book book){
        list.add(book);
    }

    public void show(){
        for(Book book: list){
            System.out.println(book.toString());
        }
    }

}
