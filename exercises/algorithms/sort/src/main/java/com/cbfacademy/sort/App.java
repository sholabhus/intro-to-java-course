package com.cbfacademy.sort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
int[]num =new int[] {55,18,-9,3,107,24,66,0};

System.out.println("print original number" + Arrays.toString(num));
QuickSort sorter = new QuickSort();
sorter.sort(num,0,7);

System.out.println("sorted Array" + Arrays.toString(num));
    }

    
        }


