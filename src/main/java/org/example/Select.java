package org.example;

public class Select extends Swap{
    public static int[] sort (int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int minInd = left;
            for (int i = left; i < arr.length; i++) {
                if (arr[i] < arr[minInd]) {
                    minInd = i;
                }
            }
            swap(arr, left, minInd);
        }
        return arr;
    }
}
