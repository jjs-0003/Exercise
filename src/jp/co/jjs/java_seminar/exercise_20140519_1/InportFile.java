package jp.co.jjs.java_seminar.exercise_20140519_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InportFile {

    public void inFile(String[] str, BookShelf books) {

        try (BufferedReader reader = Files.newBufferedReader(
            Paths.get("Book1.csv"), Charset.forName("SHIFT-JIS"))) {

            int i = 0;
            String line = null;
            String[] str2 = new String[4];
            while ((line = reader.readLine()) != null) {
                str[i] = line;
                str2 = str[i].split(",");
                Book book = new Book(str2[0], str2[1], str2[2], str2[3], str2[4]);
                books.add(book);
                i++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
