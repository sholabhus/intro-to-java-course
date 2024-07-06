package com.cbfacademy.search;

public class BinarySearch implements Search{

    @Override
    public int search(int[] sortedArray, int target) {
        int low =0;
        int high = sortedArray.length-1;

        //do until the pointers low and high meet each other.
        while (low <= high) {
            
        //find the index at the mid point of the given array (add the lowest index to the highest index and divide by two, e.g. 0 + 10 / 2 = 5)
      int mid = (low + high)/2;
    //if the target value is the mid point element
    if (target == sortedArray[mid]) {
        // return the index number for the mid point of the array 
        return mid;
    // if the target value is higher than the value of the mid point element 
    }else if (target > sortedArray[mid]){ // target could be on the right side of the array
        // set the low index to the right of the middle 
        low = mid + 1;
    // in all other cases
    }else  {                     // target could be on the left side of the array
        // set the high index to the left of the middle
        high = mid - 1;

        } 
    }

    return -1;

}
}