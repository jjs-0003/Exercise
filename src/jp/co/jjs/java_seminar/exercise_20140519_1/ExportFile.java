package jp.co.jjs.java_seminar.exercise_20140519_1;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class ExportFile {

    public void outFile(String fileName, ArrayList<Book> list) {

        try (BufferedWriter writer = Files.newBufferedWriter(
                Paths.get(fileName), Charset.forName("UTF-8"),
                StandardOpenOption.TRUNCATE_EXISTING)) {

            for (Book book : list) {
                writer.write(book.toString());
                writer.newLine();
            }

        } catch (Exception e) {
            e.getStackTrace();
        }

    }
}
