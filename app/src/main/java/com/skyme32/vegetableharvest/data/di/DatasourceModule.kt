package com.skyme32.vegetableharvest.data.di

import android.content.Context
import androidx.room.Room
import com.skyme32.vegetableharvest.data.local.datasource.AppDatabase
import com.skyme32.vegetableharvest.data.local.datasource.VegetableDao
import com.skyme32.vegetableharvest.util.DATABASE_NAME
import com.skyme32.vegetableharvest.util.POPULATE_DB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Singleton
    @Provides
    fun dbDatasource(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
            .createFromAsset(POPULATE_DB)
            .build()
    }

    @Singleton
    @Provides
    fun vegetableDao(db: AppDatabase): VegetableDao = db.vegetableDao()
}