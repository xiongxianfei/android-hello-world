package com.example.helloworld

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        viewModel = MainViewModel()
    }

    @Test
    fun `initial greeting is HELLO_WORLD`() {
        assertEquals(MainViewModel.Greeting.HELLO_WORLD, viewModel.greeting.value)
    }

    @Test
    fun `toggleGreeting switches to HELLO_ANDROID`() {
        viewModel.toggleGreeting()
        assertEquals(MainViewModel.Greeting.HELLO_ANDROID, viewModel.greeting.value)
    }

    @Test
    fun `toggleGreeting switches back to HELLO_WORLD`() {
        viewModel.toggleGreeting()
        viewModel.toggleGreeting()
        assertEquals(MainViewModel.Greeting.HELLO_WORLD, viewModel.greeting.value)
    }
}
