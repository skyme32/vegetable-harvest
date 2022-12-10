package com.skyme32.vegetabllance.data.local.model

import androidx.lifecycle.LiveData
import androidx.room.ColumnInfo
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query

@Entity(tableName = "vegetable")
data class Vegetable (
    @PrimaryKey(autoGenerate = false) val id: Int,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "type") val type: String,
    @ColumnInfo(name = "language") val language:String,
)


interface VegetableDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(vegetable: Vegetable)

    @Query("SELECT * FROM vegetable ORDER BY id DESC")
    fun getAll(): LiveData<List<Vegetable>>

    @Delete
    fun delete(vegetable: Vegetable)
}