package ru.meowthowl.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static ru.meowthowl.utils.ArgsUtils.getFileNames;
import static ru.meowthowl.utils.ArgsUtils.getOutputFileName;

public class FileUtils {

    private static final String SPACE_CHAR = " ";

    public static List<String> readData() {
        var data = new ArrayList<String>();
        for (var fileName: getFileNames()){
            var fileData = getDataByPath(fileName);
            if (fileData != null) {
                data.addAll(fileData);
            }
        }
        return data;
    }

    public static List<String> getDataByPath(String fileName) {
            var path = Paths.get(fileName);
            try (var lines = Files.lines(path)) {
                return lines.filter(s -> !s.contains(SPACE_CHAR))
                        .toList();
            } catch (IOException ex) {
                System.err.println("Произошла ошибка при чтении данных из файла");
                return null;
            }
    }

    public static void writeDataToFile(List<String> data) {
        writeDataToFile(getOutputFileName(), data);
    }

    public static void writeDataToFile(String outputFileName, List<String> data) {
        try {
            var writer = new FileWriter(outputFileName);
            for (String line : data) {
                writer.write(line + System.lineSeparator());
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
