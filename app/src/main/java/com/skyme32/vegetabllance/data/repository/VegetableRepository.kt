package com.skyme32.vegetabllance.data.repository

import androidx.lifecycle.LiveData
import com.skyme32.vegetabllance.data.local.model.VegetableSeason

interface VegetableRepository {

    fun getAllVegetables(locale: String, currentMonth: Int): LiveData<List<VegetableSeason>>

    suspend fun refreshVegetables()

    suspend fun emptyVegetables()
}