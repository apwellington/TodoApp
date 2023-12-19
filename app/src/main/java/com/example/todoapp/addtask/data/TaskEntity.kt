package com.example.todoapp.addtask.data

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class TaskEntity(
    val task: String,
    var selected: Boolean = false,
    @PrimaryKey
    val id:Long
)