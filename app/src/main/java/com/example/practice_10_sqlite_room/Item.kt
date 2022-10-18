package com.example.practice_10_sqlite_room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "items")  //указываем Entity тип и название tableName = "items"
data class  Item (
    @PrimaryKey(autoGenerate = true)//указываем антонацию и в ней автоматическая генерация ключей
    var id:Int? = null,  //переменная для записи ключей
    @ColumnInfo(name = "name")  //анотация колонны и ее название
    var name:String,
    @ColumnInfo(name = "price")
    var price:String
        )
