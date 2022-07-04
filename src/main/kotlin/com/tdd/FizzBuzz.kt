package com.tdd

class FizzBuzz {

    fun fizzbuzz(input: Int): String {
        if (input % 3 == 0)
            return "Fizz"
        return input.toString()
    }
}
