package com.skyme32.vegetabllance.work

import android.content.Context
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import retrofit2.HttpException

class RefreshWorker @AssistedInject constructor(
    @Assisted val context: Context,
    @Assisted private val workerParameters: WorkerParameters
) : CoroutineWorker(context, workerParameters) {

    companion object {
        const val WORK_NAME = "RefreshWorker"
    }

    override suspend fun doWork(): Result {
        return try {
            Log.d("Tatatlo", "ENTER")
            Result.success()
        } catch (e: HttpException) {
            Result.failure()
        }
    }
}