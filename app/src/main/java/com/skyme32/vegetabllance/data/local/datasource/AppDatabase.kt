package com.skyme32.vegetabllance.data.local.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import com.skyme32.vegetabllance.data.local.model.Season
import com.skyme32.vegetabllance.data.local.model.Vegetable
import com.skyme32.vegetabllance.data.local.model.Translation

@Database(
    entities = [
        Vegetable::class,
        Season::class,
        Translation::class,
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun vegetableDao(): VegetableDao
}