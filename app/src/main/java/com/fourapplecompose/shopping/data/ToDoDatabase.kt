package com.fourapplecompose.shopping.data

import androidx.room.Database
import androidx.room.RoomDatabase

import com.fourapplecompose.shopping.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun toDoDao(): ToDoDao
}
