package com.skyme32.vegetabllance.data.local.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.skyme32.vegetabllance.data.local.model.Vegetable
import com.skyme32.vegetabllance.data.local.model.VegetableDao

@Database(entities = [Vegetable::class], version = 1)
abstract class DBDatasource: RoomDatabase() {

    abstract fun vegetableDao(): VegetableDao
}