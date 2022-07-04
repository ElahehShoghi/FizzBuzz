package com.tdd

class FizzBuzz {

    fun fizzbuzz(input: Int): String {
        var result = input.toString()
        if (input % 15 == 0)
            result = "FizzBuzz"
        else if (input % 3 == 0)
            result = "Fizz"
        else if (input % 5 == 0)
            result = "Buzz"
        return result
    }
}
