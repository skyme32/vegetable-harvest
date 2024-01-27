package com.skyme32.vegetabllance.data.repository

import androidx.lifecycle.LiveData
import com.skyme32.vegetabllance.data.local.model.VegetableSeason

interface VegetableRepository {

    fun getMonthVegetables(currentMonth: Int): LiveData<List<VegetableSeason>>

    fun getAllVegetables(): LiveData<List<VegetableSeason>>

    suspend fun emptyVegetables()
}