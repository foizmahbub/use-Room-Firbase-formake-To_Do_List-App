package com.example.to_dolist

import androidx.room.Database
import androidx.room.RoomDatabase
@Database(entities =[Note::class], version = 1 )
abstract  class NoteDatabase:RoomDatabase() {
    abstract fun getNoteDao():NoteDao
}