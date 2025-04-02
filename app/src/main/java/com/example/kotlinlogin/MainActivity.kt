package com.example.kotlinlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold

import androidx.compose.ui.Modifier
import com.example.kotlinlogin.tasks.Task
import com.example.kotlinlogin.tasks.TaskItem
import com.example.kotlinlogin.ui.theme.KotlinLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinLoginTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HeaderProfile(
                        modifier = Modifier.padding(innerPadding)
                    )

                }


//                LoginScreen()
                //                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    LoginScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )
//
////                    val task1: Task = Task(
////                        id = 1,
////                        label = "Tarea 1",
////                        isInitialChecked = false
////                    )
////
////                    TaskItem(
////                        modifier = Modifier.padding(innerPadding),
////                        task = task1
////                    )
//                }

//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    LoginScreen(
//                        modifier = Modifier.padding(innerPadding)
//                    )
//
////                    val task1: Task = Task(
////                        id = 1,
////                        label = "Tarea 1",
////                        isInitialChecked = false
////                    )
////
////                    TaskItem(
////                        modifier = Modifier.padding(innerPadding),
////                        task = task1
////                    )
//                }
            }
        }
    }
}
