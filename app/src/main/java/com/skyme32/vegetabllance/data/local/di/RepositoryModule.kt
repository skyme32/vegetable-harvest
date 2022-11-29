package com.skyme32.vegetabllance.data.local.di

import com.skyme32.vegetabllance.data.api.datasource.RestDataSource
import com.skyme32.vegetabllance.data.api.repository.VegetableRepository
import com.skyme32.vegetabllance.data.api.repository.VegetableRepositoryImpl
import com.skyme32.vegetabllance.util.BASE_URL
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun vegetableRepository(repo: VegetableRepositoryImpl): VegetableRepository
}