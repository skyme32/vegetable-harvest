package com.skyme32.vegetabllance.data.local.model

import androidx.room.Embedded
import androidx.room.Relation

data class VegetableSeason(

    @Embedded
    val vegetable: Vegetable,

    @Relation(
        parentColumn = "id",
        entityColumn = "id_vegetable"
    )
    val seasons: List<Season>,
)
