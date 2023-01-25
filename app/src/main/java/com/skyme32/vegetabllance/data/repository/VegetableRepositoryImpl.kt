package com.skyme32.vegetabllance.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import com.skyme32.vegetabllance.data.api.datasource.RestDataSource
import com.skyme32.vegetabllance.data.local.datasource.VegetableDao
import com.skyme32.vegetabllance.data.local.datasource.asDomainModel
import com.skyme32.vegetabllance.data.local.model.VegetableSeason
import javax.inject.Inject

class VegetableRepositoryImpl @Inject constructor(
    private val dataSource: RestDataSource,
    private val vegetableDao: VegetableDao
) : VegetableRepository {

    override fun getAllVegetables(locale: String, currentMonth: Int): LiveData<List<VegetableSeason>> {
        return vegetableDao.getAllVegetables(locale, currentMonth)
    }

    override suspend fun refreshVegetables() {
        try {
            dataSource.getVegetables().results.asDomainModel().forEach { vegetableTranslation ->
                vegetableDao.insertVegetable(vegetableTranslation.vegetable)
                vegetableDao.insertTranslation(vegetableTranslation.translation)
                vegetableDao.insertSeason(vegetableTranslation.seasons)
            }
        } catch (err: Exception) {
            Log.e("refreshVegetablesError", err.message.toString())
        }
    }
}