package com.skyme32.vegetableharvest.data.di

import com.skyme32.vegetableharvest.data.repository.VegetableRepository
import com.skyme32.vegetableharvest.data.repository.VegetableRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun vegetableRepository(repo: VegetableRepositoryImpl): VegetableRepository
}