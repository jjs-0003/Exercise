package jp.co.jjs.java_seminar.exercise_20140519_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InportFile {

    public void inFile(String fileName, BookShelf books) {

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(fileName), Charset.forName("SHIFT-JIS"))) {

            String line = null;
            String[] str2 = new String[4];
            while ((line = reader.readLine()) != null) {
                str2 = line.split(",");
                if (str2[4].equals("価格")) {
                    continue;
                }
                Book book = new Book(str2[0], str2[1], str2[2], str2[3],
                        Integer.valueOf(str2[4]).intValue());
                books.add(book);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
