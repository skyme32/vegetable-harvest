package com.skyme32.vegetabllance.data.api.repository

import android.util.Log
import com.skyme32.vegetabllance.data.api.datasource.RestDataSource
import com.skyme32.vegetabllance.data.local.model.Vegetable
import com.skyme32.vegetabllance.util.Language
import javax.inject.Inject

class VegetableRepositoryImpl @Inject constructor(
    private val dataSource: RestDataSource,
): VegetableRepository {

    override suspend fun getNewVegetables(): Vegetable {
        Log.d("dataSource", dataSource.getVegetables().toString())
        return Vegetable(
            dataSource.getVegetables().results[0].id,
            dataSource.getVegetables().results[0].name_translations.en,
            dataSource.getVegetables().results[0].description_translations.en,
            dataSource.getVegetables().results[0].type,
            Language.ENGLISH.name,
        )
    }
}