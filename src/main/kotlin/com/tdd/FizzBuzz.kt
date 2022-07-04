package com.tdd

class FizzBuzz {

    fun fizzbuzz(input: Int): String {
        if (input % 15 == 0)
            return "FizzBuzz"
        if (input % 3 == 0)
            return "Fizz"
        if (input % 5 == 0)
            return "Buzz"
        return input.toString()
    }
}
