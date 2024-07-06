package com.cbfacademy.sort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//ArraySorter sorter = new VisualQuickSort();
VisualQuickSort sorter = new VisualQuickSort();
int[]arr =new int[] {55,18,-9,3,107,24,66,0};

System.out.println("print original number" + Arrays.toString(arr));
sorter.display(arr, 0, arr.length - 1, -1, arr.length - 1, -1);
//ArraySorter sorter = new VisualQuickSort();
//sort.QuickSort(arr, 0, 7);
sorter.sort(arr,0,7);
System.out.println("sorted Array" + Arrays.toString(arr));
sorter.display(arr, 0, arr.length - 1, -1, -1, -1);

    }

    
        }


