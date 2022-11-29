package com.skyme32.vegetabllance.data.api.repository

import com.skyme32.vegetabllance.data.local.model.Vegetable

interface VegetableRepository {

    suspend fun getNewVegetables(): Vegetable
}