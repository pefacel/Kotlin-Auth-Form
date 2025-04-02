package com.example.kotlinlogin.tasks

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

data class Task(
    val id: Int,
    val label: String,
    var isInitialChecked: Boolean = false
) {
    var isChecked by mutableStateOf(isInitialChecked)
}