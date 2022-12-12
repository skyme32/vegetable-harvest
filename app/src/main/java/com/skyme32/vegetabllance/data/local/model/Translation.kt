package com.skyme32.vegetabllance.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "translation",
    indices = [Index(value = ["name", "description"], unique = true)]
)
data class Translation(

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "description")
    val description: String?,

    @ColumnInfo(name = "locale")
    val locale: String?,

    @ColumnInfo(name = "id_vegetable")
    val idVegetable: Int?,
)
