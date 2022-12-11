package com.example.fizzbuzz;

import java.util.Arrays;

public class FizzBuzz {

    public String calculate(int input) {
        for (Rules rule : Rules.values()) {
            if (input % rule.number == 0) {
                return rule.output;
            }
        }

        return String.valueOf(input);
    }

    private enum Rules {
        FIFTEEN(15, "FizzBuzz"),
        FIVE(5, "Buzz"),
        THREE(3, "Fizz");

        private final int number;
        private final String output;

        Rules(int number, String output) {
            this.number = number;
            this.output = output;
        }
    }

}
