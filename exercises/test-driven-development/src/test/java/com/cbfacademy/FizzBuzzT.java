package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzT {

    @Test
    @DisplayName("test number")
    public void testNumber(){
        assertEquals("", FizzBuzz.get(2));
    }

    @Test
    @DisplayName("print Fizz")
    public void fizz(){
        //multiples of 3, returns Fizz
        assertEquals("Fizz", FizzBuzz.get(3));
        assertEquals("Fizz", FizzBuzz.get(6));

}
@Test
@DisplayName("print Buzz")
    public void buzz(){
        //multiples of 5,returns Buzz 
        assertEquals("Buzz", FizzBuzz.get(5));
}

@Test
@DisplayName("print FizzBuzz")
public void fizzBuzz(){
    //multiples of 15,returns FizzBuzz 
   assertEquals("FizzBuzz", FizzBuzz.get(15));
   assertEquals("FizzBuzz", FizzBuzz.get(30));

}
}