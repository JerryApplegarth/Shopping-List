package com.fourapplecompose.thegrocerylist.data

import androidx.room.Database
import androidx.room.RoomDatabase

import com.fourapplecompose.thegrocerylist.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun toDoDao(): ToDoDao
}
