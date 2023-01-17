package ru.meowthowl.service;
import java.util.ArrayList;
import java.util.List;
public class MergeSortUtils {
    public static void mergeSortFiles(List<String> data, boolean isInteger) {
        if (data.size() < 2) {
            return;
        }
        int mid = data.size() / 2;
        List<String> left = new ArrayList<>(data.subList(0, mid));
        List<String> right = new ArrayList<>(data.subList(mid, data.size()));
        mergeSortFiles(left, isInteger);
        mergeSortFiles(right, isInteger);
        merge(data, left, right, isInteger);
    }
    public static void merge(List<String> data, List<String> left, List<String> right, boolean isInteger) {
        int leftIndex = 0;
        int rightIndex = 0;
        int dataIndex = 0;
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (isInteger) {
                if (Integer.parseInt(left.get(leftIndex).trim()) <= Integer.parseInt(right.get(rightIndex).trim())) {
                    data.set(dataIndex, left.get(leftIndex));
                    leftIndex++;
                } else {
                    data.set(dataIndex, right.get(rightIndex));
                    rightIndex++;
                }
            } else {
                if (left.get(leftIndex).compareTo(right.get(rightIndex)) <= 0) {
                    data.set(dataIndex, left.get(leftIndex));
                    leftIndex++;
                } else {
                    data.set(dataIndex, right.get(rightIndex));
                    rightIndex++;
                }
            }
            dataIndex++;
        }
        while (leftIndex < left.size()) {
            data.set(dataIndex, left.get(leftIndex));
            leftIndex++;
            dataIndex++;
        }
        while (rightIndex < right.size()) {
            data.set(dataIndex, right.get(rightIndex));
            rightIndex++;
            dataIndex++;
        }
    }
}
