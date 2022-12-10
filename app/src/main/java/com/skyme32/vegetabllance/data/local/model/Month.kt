package com.skyme32.vegetabllance.data.local.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "month")
data class Month (
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "number")
    val number: Int
)
