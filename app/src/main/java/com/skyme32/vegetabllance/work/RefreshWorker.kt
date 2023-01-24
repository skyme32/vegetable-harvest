package com.skyme32.vegetabllance.work

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.skyme32.vegetabllance.data.repository.VegetableRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import retrofit2.HttpException

@HiltWorker
class RefreshWorker @AssistedInject constructor(
    @Assisted val context: Context,
    @Assisted private val workerParameters: WorkerParameters,
    private val vegetableRepository: VegetableRepository
) : CoroutineWorker(context, workerParameters) {

    companion object {
        const val WORK_NAME = "RefreshWorker"
    }

    override suspend fun doWork(): Result {
        return try {
            vegetableRepository.refreshVegetables()
            Result.success()
        } catch (e: HttpException) {
            Result.failure()
        }
    }
}