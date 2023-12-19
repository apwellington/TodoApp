package com.example.todoapp.ui

import com.example.todoapp.addtask.ui.data.TaskModel

sealed interface TaskUiState {
    object Loading : TaskUiState
    data class Success(val data: List<TaskModel>) : TaskUiState
    data class Error(val throwable: Throwable) : TaskUiState
}