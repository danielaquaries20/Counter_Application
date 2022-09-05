package com.example.counterapplication

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val counter = ObservableField(0)

    fun increaseCounter() {
        val current = counter.get() ?: 0
        if (current < 99) {
            counter.set(current + 1)
        } else {
            return counter.set(99)
        }

    }

    fun decreaseCounter() {
        val current = counter.get() ?: 0
        if (current > 0) {
            counter.set(current - 1)
        } else {
            counter.set(0)
        }

    }


}