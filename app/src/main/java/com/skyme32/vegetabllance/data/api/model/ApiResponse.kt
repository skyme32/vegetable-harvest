package com.skyme32.vegetabllance.data.api.model

data class ApiResponse(
    val meta: Meta,
    val results: List<Result> = emptyList()
)