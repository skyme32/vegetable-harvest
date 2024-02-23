package com.skyme32.vegetabllance.data.repository

import androidx.lifecycle.LiveData
import com.skyme32.vegetabllance.data.local.datasource.VegetableDao
import com.skyme32.vegetabllance.data.local.model.VegetableSeason
import javax.inject.Inject

class VegetableRepositoryImpl @Inject constructor(
    private val vegetableDao: VegetableDao
) : VegetableRepository {

    override fun getMonthVegetables(currentMonth: Int): LiveData<List<VegetableSeason>> {
        return vegetableDao.getMonthVegetables(currentMonth)
    }

    override fun getMonthVegetablesSeson(currentMonth: Int): LiveData<List<VegetableSeason>> {
        return vegetableDao.getMonthVegetablesSeson(currentMonth)
    }

    override fun getAllVegetables(): LiveData<List<VegetableSeason>> {
        return vegetableDao.getAllVegetables()
    }
}