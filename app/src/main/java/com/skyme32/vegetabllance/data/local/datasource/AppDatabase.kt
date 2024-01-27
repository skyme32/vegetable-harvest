package com.skyme32.vegetabllance.data.local.datasource

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.skyme32.vegetabllance.data.local.model.Season
import com.skyme32.vegetabllance.data.local.model.Vegetable
import dagger.Provides
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Singleton


@Database(
    entities = [
        Vegetable::class,
        Season::class
    ],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun vegetableDao(): VegetableDao
}