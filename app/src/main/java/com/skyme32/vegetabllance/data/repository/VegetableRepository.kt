package com.skyme32.vegetabllance.data.repository

import com.skyme32.vegetabllance.data.local.model.VegetableTranslation

interface VegetableRepository {

    suspend fun getAllVegetables(locale: String): List<VegetableTranslation>

    suspend fun refreshVegetables()
}