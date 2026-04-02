package com.example.helloworld

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val _greeting = MutableStateFlow(Greeting.HELLO_WORLD)
    val greeting: StateFlow<Greeting> = _greeting.asStateFlow()

    fun toggleGreeting() {
        _greeting.value = if (_greeting.value == Greeting.HELLO_WORLD) {
            Greeting.HELLO_ANDROID
        } else {
            Greeting.HELLO_WORLD
        }
    }

    enum class Greeting {
        HELLO_WORLD,
        HELLO_ANDROID
    }
}
