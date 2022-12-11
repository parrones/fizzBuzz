package com.example.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void return_input_As_String() {
        Assertions.assertEquals("1", fizzBuzz.calculate(1));
        Assertions.assertEquals("2", fizzBuzz.calculate(2));
    }

    @Test
    public void return_Fizz() {
        Assertions.assertEquals("Fizz", fizzBuzz.calculate(3));
        Assertions.assertEquals("Fizz", fizzBuzz.calculate(6));
        Assertions.assertEquals("Fizz", fizzBuzz.calculate(9));
    }

    @Test
    public void return_Buzz() {
        Assertions.assertEquals("Buzz", fizzBuzz.calculate(5));
        Assertions.assertEquals("Buzz", fizzBuzz.calculate(10));
        Assertions.assertEquals("Buzz", fizzBuzz.calculate(20));
    }

    @Test
    public void return_Fizz_Buzz() {
        Assertions.assertEquals("FizzBuzz", fizzBuzz.calculate(15));
        Assertions.assertEquals("FizzBuzz", fizzBuzz.calculate(30));
    }
}
