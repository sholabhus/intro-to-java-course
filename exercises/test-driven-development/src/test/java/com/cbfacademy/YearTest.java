package com.cbfacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
@DisplayName(value="Check input integer is a leap year")
public class YearTest {



    static Stream<Arguments>LeapYearTest(){
        return Stream.of(
            Arguments.of(true, 2000),
            Arguments.of(false, 1700),
            Arguments.of(true, 2004),
            Arguments.of(false, 2005)
        );
    }

    @ParameterizedTest
    @MethodSource("LeapYearTest")
    @DisplayName("Check input integer is a leap year")
    public void testLeapYear(boolean expected, int year){
        assertEquals(expected, Year.isLeapYear(year), "Year " + year + " leap year test failed");

    }

}   

 
//     @Test
//     @DisplayName("Year is Divisible By 400")
//     public void YearDivisibleBy400(){
//        assertEquals(true, Year.isLeapYear(2000),"Year 2000 should be a leap year");
//     }

//     @Test
//     @DisplayName("Year is Divisible By 100 but not by 400")
//     public void YearDivisibleBy100(){
//        assertEquals(false, Year.isLeapYear(100),"Year 1700 shouldn't be a leap year");
//     }
//     @Test
//     @DisplayName("Year is Divisible By 4 but not by 100")
//     public void YearDivisibleBy4(){
//        assertEquals(true, Year.isLeapYear(2004),"Year 2004 is a leap year");
//     }

//     @Test
//     @DisplayName("Year  not Divisible By 4 ")
//     public void YearNotDivisibleBy4(){
//        assertEquals(false, Year.isLeapYear(2005),"Year 2005 is a leap year");
//     }


// }

