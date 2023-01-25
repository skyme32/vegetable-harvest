package com.skyme32.vegetabllance.data.api.model

data class Result(
    val cold_season: List<Int>,
    val description_translations: DescriptionTranslations,
    val id: Int,
    val image: String,
    val name_translations: NameTranslations,
    val season: List<Int>,
    val type: String,
    val title: String
)