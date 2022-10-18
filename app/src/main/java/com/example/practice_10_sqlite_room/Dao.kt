package com.example.practice_10_sqlite_room
import androidx.room.Dao  //импорт
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao   //анотация Dao для записывания или считывания
interface Dao {
    @Insert  //анотация для функции
    fun insertItem(item:Item)
    @Query("SELECT * FROM items")  //анотация для считывания и указываем в нее SELECT(выбрать) *(все) FROM(из) items(наша ранее созданая таблица)
    fun getAllItems(): Flow<List<Item>>
}