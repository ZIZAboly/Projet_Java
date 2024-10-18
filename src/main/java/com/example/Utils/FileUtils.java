package com.example.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {

    public static boolean fileExists(String path) {
        return new File(path).exists();
    }

    public static List<String> readFile(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }

    public static void writeFile(String path, List<String> content) throws IOException {
        Files.write(Paths.get(path), content);
    }
}
