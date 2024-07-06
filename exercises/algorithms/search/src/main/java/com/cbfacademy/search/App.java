package com.cbfacademy.search;

public class App {
    
        public static void main(String[] args) {
            BinarySearch binarySearch = new BinarySearch();
            int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int target = 6;
    
            int result = binarySearch.search(sortedArray, target);
            if (result != -1) {
                System.out.println("Target found at index: " + result);
            } else {
                System.out.println("Target not found in the array.");
            }
        }
    }

