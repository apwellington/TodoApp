package com.example.todoapp.addtask.ui.data


data class TaskModel(val task: String, var selected: Boolean = false, val id:Long = System.currentTimeMillis()) {

}