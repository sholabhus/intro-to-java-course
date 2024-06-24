package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizz (List<Integer> numbers) {
         
    List<String>result =new ArrayList<>();
// Iterate through each number in the input list
        for (int i=0; i < numbers.size(); i++){
// Check if the current number is divisible by both 3 and 5
        if(numbers.get(i) % 3 == 0 && numbers.get(i) % 5 ==0){
            result.add("FizzBuzz");
 // Check if the current number is divisible by 3   
           }else if(numbers.get(i) % 3 == 0){
                result.add("Fizz");
// Check if the current number is divisible by 5
           } else if(numbers.get(i) % 5 == 0){
               result.add("Buzz");
             } else{
// If the current number is not divisible by 3 or 5, add the number itself
                result.add(numbers.get(i).toString());
        }
    }  
        return result;
}
    
// whichMonth method takes an integer parameter number, which represents the month number
 
    public String whichMonth(Integer number) {
        
    String[]month ={"January", "February", "March", "April", "May", "June",
    "July", "August", "September", "October", "November", "December"};  

       //check  if number is withinthe valid range of 1 to 12
        if(number >=1 && number<=12){
            return month[number-1]; //for zero index
        }else{
            return "Invalid month number";
        }

    }
     

public Map<String, Integer> sumOfOddsAndSumOfEvens() {
 // Create and initialize a list of 100 numbers from 1 to 100
   List<Integer> numbers = new ArrayList<>();
    for(int i=1; i <=100; i++){
        numbers.add(i); 
    }

    int sumOfOdds=0;
    int sumOfEvens =0;
    
    //determines the sum of all the even and odd numbers in the list
    for(Integer number : numbers)  {
        if(number % 2 ==0) {
        sumOfEvens +=number;
        } else {
            sumOfOdds +=number;
        }

        }
        //create a map to store the sumO
        Map<String,Integer> result=new HashMap<>();
        result. put("SumOfEvens", sumOfEvens);
        result. put("SumOfOdds", sumOfOdds);
    
        return result;
    }
    
    

            public List<Integer> reverse(ArrayList<Integer> numbers) {

         // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
      //  throw new RuntimeException("Not implemented");
        
       List<Integer> list = new ArrayList<>(); //  Creates a new ArrayList<Integer> called list
        
        for (int i = numbers.size() - 1; i >= 0; i--){ //Iterates through the numbers list from the last element to the first element 
        list.add(numbers.get(i)); //Adds each element from the numbers list to the list
    }
        return list;
    }

    public String getName() {
        return "Flow Control Exercises";
    }

}