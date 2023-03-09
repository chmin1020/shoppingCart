package com.FallTurtle.shoppingcart.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.FallTurtle.shoppingcart.etc.Converters

@Database(entities = [BigList::class], version = 2, exportSchema = false)
@TypeConverters(Converters::class)
abstract class RoomDB : RoomDatabase() {
    abstract fun bigListDao(): BigListDao //데이터베이스를 관리할 dao
}