package ru.meowthowl;
import static ru.meowthowl.service.AppUtils.*;
import static ru.meowthowl.service.FileUtils.*;
import static ru.meowthowl.service.MergeSortUtils.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class MergeSort {
    public static void main(String[] args) {
        //1. Parse command line arguments
        parseArgs(args);
        //2. Read the data from the files
        List<String> data = new ArrayList<>();
        for (var fileName: getFileNames()){
            var fileData = getDataByPath(fileName);
            if (fileData != null) {
                data.addAll(fileData);
            }
        }
        //3. Perform the merge sort on the data
        mergeSortFiles(data, isIsInteger());
        //4. Sort the result
        if (!isIsAscending()) {
            Collections.reverse(data);
        }
        //5. Write the result to a new file
        writeDataToFile(getOutputFileName(), data);
    }
}