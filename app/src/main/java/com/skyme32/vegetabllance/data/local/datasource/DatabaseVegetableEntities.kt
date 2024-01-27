package com.skyme32.vegetabllance.data.local.datasource
/*
import com.skyme32.vegetabllance.data.local.model.Season
import com.skyme32.vegetabllance.data.local.model.Vegetable

fun List<Result>.asDomainModel(): List<VegetableTranslation> {
    return map {
        VegetableTranslation(
            Vegetable(it.id, it.type, it.image),
            asDomainTranslation(it),
            asDomainSesion(it, it.id)
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

private fun asDomainSesion(result: Result, id: Int): List<Season> {
    val season = result.season.asSequence().map {
        Season(it, id, true)
    }.toList()

    val coldSeason = result.cold_season.asSequence().map {
        Season(it, id, false)
    }.toList()

    return season.plus(coldSeason).sortedBy { season -> season.month }
}
*/