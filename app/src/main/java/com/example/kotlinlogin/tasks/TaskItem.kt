package com.example.kotlinlogin.tasks

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TaskItem(
    modifier: Modifier = Modifier,
    task: Task
) {

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = task.label
        )

        Checkbox(
            checked = task.isChecked,
            onCheckedChange = { task.isChecked = !task.isChecked }
        )
    }

}

