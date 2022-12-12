package com.skyme32.vegetabllance.data.repository

import android.util.Log
import com.skyme32.vegetabllance.data.api.datasource.RestDataSource
import com.skyme32.vegetabllance.data.local.datasource.VegetableDao
import com.skyme32.vegetabllance.data.local.datasource.asDomainModel
import com.skyme32.vegetabllance.data.local.model.VegetableSeason
import javax.inject.Inject

class VegetableRepositoryImpl @Inject constructor(
    private val dataSource: RestDataSource,
    private val vegetableDao: VegetableDao
) : VegetableRepository {

    override suspend fun getAllVegetables(locale: String): List<VegetableSeason> {
        return vegetableDao.getAllVegetables(locale = locale)
    }

    override suspend fun refreshVegetables() {
        try {
            dataSource.getVegetables().results.asDomainModel().forEach { vegetableTranslation ->
                vegetableDao.insertVegetable(vegetableTranslation.vegetable)
                vegetableDao.insertTranslation(vegetableTranslation.translation)
                vegetableDao.insertSeason(vegetableTranslation.seasons)
            }
        } catch (err: Exception) {
            Log.e("refreshVegetables", err.message.toString())
        }
    }
}