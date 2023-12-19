package com.example.todoapp.addtask.data


import com.example.todoapp.addtask.ui.data.TaskModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TaskRepository @Inject constructor(
    private val taskDao: TaskDao
)
{

    val allTasks: Flow<List<TaskModel>> = taskDao.getAll().map { list ->
        list.map { task ->
            TaskModel(task.task, task.selected, task.id)
        }
    }

    suspend fun insertTask(task: TaskModel) = taskDao.insert(TaskEntity(task.task, task.selected, task.id))


    suspend fun deleteTask(task: TaskModel) = taskDao.delete(task.id)

    suspend fun updateTask(task: TaskModel) = taskDao.update(TaskEntity(task.task, task.selected, task.id))


}