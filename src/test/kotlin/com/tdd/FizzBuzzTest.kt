package com.tdd

import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun shouldReturnString_forInteger() {
        assertEquals("1", FizzBuzz().fizzbuzz(1))
    }
}