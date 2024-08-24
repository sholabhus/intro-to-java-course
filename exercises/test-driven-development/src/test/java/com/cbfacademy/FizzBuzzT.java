package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
@DisplayName(value="Testing Fizz Buzz test should")
public class FizzBuzzT {

    static Stream<Arguments>outPutProvider(){
        return Stream.of(
            Arguments.of(1, "1"),
            Arguments.of(2, "2"),
            Arguments.of(3,"Fizz"),
            Arguments.of(6,"Fizz"),
            Arguments.of(5,"Buzz"),
            Arguments.of(10,"Buzz"),
            Arguments.of(15,"FizzBuzz")
        );
        

    }

    @ParameterizedTest
    @MethodSource("outPutProvider")
    @DisplayName("Test add method")
    public void testFizzBuzz(int number, String expected){
        final String actual =FizzBuzz.get(number);
        assertEquals(expected, actual,
        "Failed for input: " + number);
        
        
    }

   
       }

//    // @Test
//     @DisplayName("test number")
//     public void testNumber(){
//         assertEquals("", FizzBuzz.get(2));
//     }

//     @Test
//     @DisplayName("print Fizz")
//     public void fizz(){
//         //multiples of 3, returns Fizz
//         assertEquals("Fizz", FizzBuzz.get(3));
//         assertEquals("Fizz", FizzBuzz.get(6));

// }
// @Test
// @DisplayName("print Buzz")
//     public void buzz(){
//         //multiples of 5,returns Buzz 
//         assertEquals("Buzz", FizzBuzz.get(5));
// }

// @Test
// @DisplayName("print FizzBuzz")
// public void fizzBuzz(){
//     //multiples of 15,returns FizzBuzz 
//    assertEquals("FizzBuzz", FizzBuzz.get(15));
//    assertEquals("FizzBuzz", FizzBuzz.get(30));

// }
