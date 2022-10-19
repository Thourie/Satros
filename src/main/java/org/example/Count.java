package org.example;

public class Count{
    public static int[] sort(int[] theArray, int maxValue) {
        int numCounts[] = new int[maxValue + 1];
        for (int num : theArray) {
            numCounts[num]++;
        }
        int[] sortedArray = new int[theArray.length];
        int currentSortedIndex = 0;
        for (int n = 0; n < numCounts.length; n++) {
            int count = numCounts[n];
            for (int k = 0; k < count; k++) {
                sortedArray[currentSortedIndex] = n;
                currentSortedIndex++;
            }
        }
        return sortedArray;
    }
}
