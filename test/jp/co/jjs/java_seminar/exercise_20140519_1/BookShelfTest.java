package jp.co.jjs.java_seminar.exercise_20140519_1;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class BookShelfTest {

    BookShelf list ;

    @Before
    public void setUp(){
        list = new BookShelf();
        Book book1 = new Book("a", "b", "c","d", 1);
        Book book2 = new Book("b", "c", "d","e", 2);
        Book book3 = new Book("c", "d", "e","f", 3);
        list.list.add(book1);
        list.list.add(book2);
        list.list.add(book3);
    }

    @Test
    public void getAllメソッドを実行するとBookshelfが保持している件数分のBookオブジェクトを返すこと(){

        ArrayList<Book> actual = list.getAll();

        assertThat(actual.size(), is(3));
    }

    @Test
    public void getAllメソッドですべての値が返されること() {
        ArrayList<Book> actual = list.getAll();
        Book book1 = actual.get(0);
        assertThat(book1.getTitle(), is("a"));
        assertThat(book1.getIsbn(), is("b"));
        assertThat(book1.getAuthor(), is("c"));
        assertThat(book1.getPublisher(), is("d"));
        assertThat(book1.getPrice(), is(1));

        Book book2 = actual.get(1);
        assertThat(book2.getTitle(), is("b"));
        assertThat(book2.getIsbn(), is("c"));
        assertThat(book2.getAuthor(), is("d"));
        assertThat(book2.getPublisher(), is("e"));
        assertThat(book2.getPrice(), is(2));

        Book book3 = actual.get(2);
        assertThat(book3.getTitle(), is("c"));
        assertThat(book3.getIsbn(), is("d"));
        assertThat(book3.getAuthor(), is("e"));
        assertThat(book3.getPublisher(), is("f"));
        assertThat(book3.getPrice(), is(3));
    }

}
