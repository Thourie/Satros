package org.example;

public class Shuttle extends Swap{

    public static int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                swap(arr, i, i - 1);
                for (int z = i - 1; (z - 1) >= 0; z--) {
                    if (arr[z] < arr[z - 1]) {
                        swap(arr, z, z - 1);
                    } else {
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
