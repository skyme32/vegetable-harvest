package com.skyme32.vegetabllance.data.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.skyme32.vegetabllance.data.local.datasource.AppDatabase
import com.skyme32.vegetabllance.data.local.datasource.VegetableCallBack
import com.skyme32.vegetabllance.data.local.datasource.VegetableDao
import com.skyme32.vegetabllance.util.BASE_URL
import com.skyme32.vegetabllance.util.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Provider
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Singleton
    @Provides
    @Named("BaseUrl")
    fun provideBaseUrl() = BASE_URL

    @Singleton
    @Provides
    fun dbDatasource(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .createFromAsset("database/myapp.db")
            .build()
    }

    @Singleton
    @Provides
    fun vegetableDao(db: AppDatabase): VegetableDao = db.vegetableDao()
}