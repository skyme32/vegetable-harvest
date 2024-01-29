package com.skyme32.vegetabllance.data.local.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.skyme32.vegetabllance.data.local.model.Season
import com.skyme32.vegetabllance.data.local.model.Vegetable

@Database(
    entities = [
        Vegetable::class,
        Season::class
    ],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun vegetableDao(): VegetableDao
}