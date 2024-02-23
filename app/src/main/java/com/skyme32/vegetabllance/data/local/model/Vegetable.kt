package com.skyme32.vegetabllance.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "vegetable",
)
data class Vegetable(

    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "type")
    val type: Boolean,

    @ColumnInfo(name = "name")
    val name: String
)
