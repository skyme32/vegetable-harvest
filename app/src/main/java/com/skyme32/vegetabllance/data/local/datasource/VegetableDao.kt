package com.skyme32.vegetabllance.data.local.datasource

import androidx.lifecycle.LiveData
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

    @Query("DELETE FROM vegetable")
    suspend fun deleteVegetable()

    @Query("DELETE FROM translation")
    suspend fun deleteTranslation()

    @Query("DELETE FROM season")
    suspend fun deleteSeason()

    @Transaction
    @Query(
        "SELECT DISTINCT translation.name, " +
                "translation.description, " +
                "translation.locale, " +
                "vegetable.* " +
                "FROM vegetable, translation " +
                "JOIN season ON vegetable.id = season.id_vegetable " +
                "WHERE vegetable.id = translation.id_vegetable " +
                "AND translation.locale = :locale " +
                "AND season.month = :currentMonth " +
                "ORDER BY translation.name ASC"
    )
    fun getAllVegetables(locale: String, currentMonth: Int): LiveData<List<VegetableSeason>>

}