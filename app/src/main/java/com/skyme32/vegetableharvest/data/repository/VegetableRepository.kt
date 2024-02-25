package com.skyme32.vegetableharvest.data.repository

import androidx.lifecycle.LiveData
import com.skyme32.vegetableharvest.data.local.model.VegetableSeason

interface VegetableRepository {

    fun getMonthVegetables(currentMonth: Int): LiveData<List<VegetableSeason>>

    fun getMonthVegetablesSeson(currentMonth: Int): LiveData<List<VegetableSeason>>

    fun getAllVegetables(): LiveData<List<VegetableSeason>>
}