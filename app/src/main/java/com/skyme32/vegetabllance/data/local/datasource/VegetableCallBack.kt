package com.skyme32.vegetabllance.data.local.datasource

import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.skyme32.vegetabllance.data.local.model.Vegetable
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Provider

class VegetableCallBack (
    private val provider: Provider<VegetableDao>
) : RoomDatabase.Callback() {

    private val applicationScope = CoroutineScope(SupervisorJob())

    override fun onCreate(db: SupportSQLiteDatabase) {
        super.onCreate(db)
        applicationScope.launch(Dispatchers.IO) {
            populateDatabase()
        }
    }

    override fun onOpen(db: SupportSQLiteDatabase) {
        super.onOpen(db)

        if (db.version > 1) {
            applicationScope.launch(Dispatchers.IO) {
                cleanDatabase()
                populateDatabase()
            }
        }
    }

    private suspend fun populateDatabase() {
        val vegetable = Vegetable(1, true, "artichoke")
        provider.get().insertOrUpdateVegetable(vegetable)
    }

    private suspend fun cleanDatabase() {
        provider.get().deleteVegetable()
        provider.get().deleteSeason()
    }
}