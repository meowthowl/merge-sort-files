package ru.meowthowl.utils;
import java.util.ArrayList;
import java.util.List;
public class ArgsUtils {
    // Default values
    private static boolean isAscending = true;
    private static boolean isInteger = false;
    private static String outputFileName = "";
    private static final List<String> fileNames = new ArrayList<>();
    // Parse command line arguments
    public static void parseArgs(String[] args){
        for (String arg : args) {
            switch (arg) {
                case "-a" -> isAscending = true;
                case "-d" -> isAscending = false;
                case "-i" -> isInteger = true;
                case "-s" -> isInteger = false;
                default -> {
                    if (outputFileName.isEmpty()) {
                        outputFileName = arg;
                    } else {
                        fileNames.add(arg);
                    }
                }
            }
        }
        if (fileNames.isEmpty() || outputFileName.isEmpty()) {
            System.out.println("Пожалуйста введите имена input и output файлов");
        }
    }
    public static boolean isAscending() {
        return isAscending;
    }
    public static boolean isInteger() {
        return isInteger;
    }
    public static String getOutputFileName() {
        return outputFileName;
    }
    public static List<String> getFileNames() {
        return fileNames;
    }
}
