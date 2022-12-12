package com.skyme32.vegetabllance.data.repository

import com.skyme32.vegetabllance.data.local.model.VegetableSeason

interface VegetableRepository {

    suspend fun getAllVegetables(locale: String): List<VegetableSeason>

    suspend fun refreshVegetables()
}