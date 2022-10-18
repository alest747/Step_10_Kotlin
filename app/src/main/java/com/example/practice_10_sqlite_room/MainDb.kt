package com.example.practice_10_sqlite_room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Item::class], version = 1)  //анотация датабазы и в нее наш созданный Entity который мы назвали Item и указываем версию
abstract class MainDb:RoomDatabase() {
    abstract fun getDao(): Dao

    companion object {
        fun getDb(context:Context):MainDb{
            return Room.databaseBuilder(  //создание базы данных
                context.applicationContext,  //
                MainDb::class.java,
                "test_db"  //название базы данных
            ).build()  //строит

        }
    }
}