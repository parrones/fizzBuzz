package com.example.fizzbuzz;

import org.junit.jupiter.api.Test;

public class FizzBuzzGameTest {


    @Test
    public void FizzBuzzGameTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100 ; i++) {
            System.out.println(fizzBuzz.calculate(i));
        }

    }
}
