package com.tdd

import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun shouldReturnString_forInteger() {
        assertEquals("1", FizzBuzz().fizzbuzz(1))
    }

    @Test
    fun shouldReturnFizz_forMultipliesOfThree() {
        assertEquals("Fizz", FizzBuzz().fizzbuzz(3))
    }

    @Test
    fun shouldReturnBuzz_forMultipliesOfFive() {
        assertEquals("Buzz", FizzBuzz().fizzbuzz(10))
    }

    @Test
    fun shouldReturnFizzBuzz_forMultipliesOfThreeAndFive() {
        assertEquals("FizzBuzz", FizzBuzz().fizzbuzz(30))
    }
}