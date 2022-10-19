package org.example;

import java.util.Arrays;

public class Main {

    static int[] arr = {10, 2, 10, 3, 1, 2, 5};

    public static void main (String[]args){

       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(Bubble.sort(arr)));
       System.out.println(Arrays.toString(Count.sort(arr, arr[0])));
       System.out.println(Arrays.toString(Insert.sort(arr)));
       System.out.println(Arrays.toString(Merge.sort(arr, 0, arr.length - 1)));
       System.out.println(Arrays.toString(Quick.sort(arr, 0, arr.length - 1)));
       System.out.println(Arrays.toString(Select.sort(arr)));
       System.out.println(Arrays.toString(Shuttle.sort(arr)));
       System.out.println(Arrays.toString(Shell.sort(arr)));
    }



}