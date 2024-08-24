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
        //divisible by3
        assertEquals("Fizz", FizzBuzz.get(3));
        assertEquals("Fizz", FizzBuzz.get(6));

}
@Test
@DisplayName("print Buzz")
//divisible by5
    public void buzz(){
        assertEquals("Buzz", FizzBuzz.get(5));
}

@Test
@DisplayName("print FizzBuzz")
public void fizzBuzz(){
   assertEquals("FizzBuzz", FizzBuzz.get(15));
   assertEquals("FizzBuzz", FizzBuzz.get(30));

}
}