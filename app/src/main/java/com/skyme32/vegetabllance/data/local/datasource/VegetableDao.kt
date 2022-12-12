package com.skyme32.vegetabllance.data.local.datasource

import androidx.room.*
import com.skyme32.vegetabllance.data.local.model.*

@Dao
interface VegetableDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertVegetable(vegetable: Vegetable)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTranslation(translation: List<Translation>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSeason(season: List<Season>)

    @Delete
    suspend fun deleteVegetable(vegetable: Vegetable)

    @Delete
    suspend fun deleteTranslation(translation: Translation)

    @Delete
    suspend fun deleteSeason(season: Season)

    @Transaction
    @Query("SELECT * FROM vegetable")
    suspend fun getAllVegetables(): List<VegetableTranslation>

    /*
    @Transaction
    @Query("SELECT DISTINCT translation.name, " +
            "translation.description, " +
            "translation.locale, " +
            "vegetable.* " +
            "FROM vegetable, translation " +
            "JOIN season ON vegetable.id = season.id_vegetable " +
            "WHERE vegetable.id = translation.id_vegetable " +
            "AND translation.locale = :locale")
     suspend fun getAllVegetables(locale: String): List<VegetableSeason>
     */
}