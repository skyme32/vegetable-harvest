package com.skyme32.vegetabllance.data.repository

import android.util.Log
import com.skyme32.vegetabllance.data.api.datasource.RestDataSource
import com.skyme32.vegetabllance.data.local.datasource.VegetableDao
import com.skyme32.vegetabllance.data.local.datasource.asDomainModel
import com.skyme32.vegetabllance.data.local.model.VegetableTranslation
import javax.inject.Inject

class VegetableRepositoryImpl @Inject constructor(
    private val dataSource: RestDataSource,
    private val vegetableDao: VegetableDao
) : VegetableRepository {

    override suspend fun getAllVegetables(locale: String): List<VegetableTranslation> {
        return vegetableDao.getAllVegetables()
    }

    override suspend fun refreshVegetables() {
        try {
            dataSource.getVegetables().results.asDomainModel().forEach { vegetableTranslation ->
                Log.i("refreshVegetables", vegetableTranslation.toString())
                vegetableDao.insertVegetable(vegetableTranslation.vegetable)
                vegetableDao.insertTranslation(vegetableTranslation.translation)
                vegetableDao.insertSeason(vegetableTranslation.seasons)
            }
        } catch (err: Exception) {
            Log.e("refreshVegetablesError", err.message.toString())
        }
    }
}