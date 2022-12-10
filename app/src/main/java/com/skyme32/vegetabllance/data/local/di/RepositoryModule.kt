package com.skyme32.vegetabllance.data.local.di

import com.skyme32.vegetabllance.data.api.repository.VegetableRepository
import com.skyme32.vegetabllance.data.api.repository.VegetableRepositoryImpl
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