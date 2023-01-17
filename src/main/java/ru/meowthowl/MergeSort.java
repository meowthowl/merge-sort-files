package ru.meowthowl;
import static ru.meowthowl.utils.ArgsUtils.*;
import static ru.meowthowl.utils.FileUtils.*;
import static ru.meowthowl.utils.MergeSortUtils.*;

import java.util.List;
public class MergeSort {
    public static void main(String[] args) {
        //1. Parse command line arguments
        parseArgs(args);
        //2. Read the data from files
        List<String> data = readData();
        //3. Perform the merge sort on the data
        mergeSortFiles(data);
        //4. Write the result to a new file
        writeDataToFile(data);
    }
}