package com.skyme32.vegetabllance.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "vegetable",
    indices = [Index(value = ["id"], unique = true)]
)
data class Vegetable(

    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "type")
    val type: Boolean?,

    @ColumnInfo(name = "name")
    val name: String?,
)
