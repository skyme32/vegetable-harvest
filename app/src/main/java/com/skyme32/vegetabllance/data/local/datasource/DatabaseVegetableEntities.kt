package com.skyme32.vegetabllance.data.local.datasource

import com.skyme32.vegetabllance.data.api.model.Result
import com.skyme32.vegetabllance.data.local.model.Season
import com.skyme32.vegetabllance.data.local.model.Translation
import com.skyme32.vegetabllance.data.local.model.Vegetable
import com.skyme32.vegetabllance.data.local.model.VegetableTranslation

fun List<Result>.asDomainModel(): List<VegetableTranslation> {
    return map {
        VegetableTranslation(
            Vegetable(it.id, it.type, it.image),
            asDomainTranslation(it),
            asDomainSesion(it.season, it.id)
        )
    }
}

private fun asDomainTranslation(result: Result): List<Translation> {
    return listOf(
        Translation(
            result.name_translations.en,
            result.description_translations.en,
            "en",
            result.id
        ),
        Translation(
            result.name_translations.es,
            result.description_translations.es,
            "es",
            result.id
        ),
        Translation(
            result.name_translations.ca,
            result.description_translations.ca,
            "ca",
            result.id
        )
    )
}

private fun asDomainSesion(seasons: List<Int>, id: Int): List<Season> {
    return seasons.asSequence().map {
        Season(it, id)
    }.toList()
}