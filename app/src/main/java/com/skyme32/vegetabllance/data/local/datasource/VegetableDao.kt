package com.skyme32.vegetabllance.data.local.datasource

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Upsert
import com.skyme32.vegetabllance.data.local.model.Season
import com.skyme32.vegetabllance.data.local.model.Vegetable
import com.skyme32.vegetabllance.data.local.model.VegetableSeason

@Dao
interface VegetableDao {

    @Upsert(Vegetable::class)
    suspend fun insertOrUpdateVegetable(vararg vegetable: Vegetable)

    @Upsert(Season::class)
    suspend fun insertOrUpdateSeason(vararg season: Season)

    @Query("DELETE FROM vegetable")
    suspend fun deleteVegetable()

    @Query("DELETE FROM season")
    suspend fun deleteSeason()

    @Transaction
    @Query(
        "SELECT DISTINCT vegetable.* " +
                "FROM vegetable " +
                "JOIN season ON vegetable.id = season.id_vegetable " +
                "WHERE season.month = :currentMonth "
    )
    fun getMonthVegetables(currentMonth: Int): LiveData<List<VegetableSeason>>

    @Transaction
    @Query(
        "SELECT DISTINCT vegetable.* " +
                "FROM vegetable " +
                "JOIN season ON vegetable.id = season.id_vegetable " +
                "WHERE season.month = :currentMonth "
    )
    fun getMonthVegetablesSeson(currentMonth: Int): LiveData<List<VegetableSeason>>

    @Transaction
    @Query(
        "SELECT DISTINCT vegetable.* " +
                "FROM vegetable " +
                "JOIN season ON vegetable.id = season.id_vegetable"
    )
    fun getAllVegetables(): LiveData<List<VegetableSeason>>
}