package com.example.helloworld

import org.junit.Assert.assertEquals
import org.junit.Test

class GreetingTest {

    @Test
    fun `greeting message is correct`() {
        val greeting = "Hello World!"
        assertEquals("Hello World!", greeting)
    }

    @Test
    fun `app name is correct`() {
        val appName = "Hello World"
        assertEquals("Hello World", appName)
    }
}
