package com.skyme32.vegetabllance.data.api.datasource

import com.skyme32.vegetabllance.data.api.model.ApiResponse
import retrofit2.http.GET

interface RestDataSource {

    @GET("vegetables.json")
    suspend fun getVegetables(): ApiResponse
}