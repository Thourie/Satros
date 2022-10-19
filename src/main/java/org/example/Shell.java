package org.example;

public class Shell extends Swap{
    public static int[] sort(int[] arr) {
        int gap = arr.length / 2;
        while (gap >= 1) {
            for (int right = 0; right < arr.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (arr[c] > arr[c + gap]) {
                        swap(arr, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
        return arr;
    }
}
