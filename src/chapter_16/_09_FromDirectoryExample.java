package chapter_16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class _09_FromDirectoryExample {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:/JavaWorkspace/This is Java_Book/src");
        Stream<Path> stream = Files.list(path);
        stream.forEach(p-> System.out.println(p.getFileName()));
    }
}
