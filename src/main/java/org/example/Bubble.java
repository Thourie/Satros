package org.example;

public class Bubble extends Swap{
    public static
    int[] sort(int[] arr) {
        for (int j = 0; j < arr.length; j++)
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        return arr;
    }
}
