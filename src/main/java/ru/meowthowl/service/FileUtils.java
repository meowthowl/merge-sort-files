package ru.meowthowl.service;
import static java.util.stream.Collectors.toList;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;
public class FileUtils {
    public static List<String> getDataByPath(String fileName) {
            Path path = Paths.get(fileName);
            try (Stream<String> lines = Files.lines(path)) {
                return lines.filter(s -> !s.contains(" ")).collect(toList());
            } catch (IOException ex) {
                System.err.println("Произошла ошибка при чтении данных из файла");
                return null;
            }
    }
    public static void writeDataToFile(String outputFileName, List<String> data) {
        try {
            FileWriter writer = new FileWriter(outputFileName);
            for (String s : data) {
                writer.write(s + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
