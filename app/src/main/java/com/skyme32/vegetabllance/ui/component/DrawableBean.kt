package com.skyme32.vegetabllance.ui.component

import androidx.compose.runtime.Composable
import com.skyme32.vegetabllance.R

@Composable
fun getDrawableId(name: String): Int {
    return try {
        R.drawable::class.java.getField(name).getInt(null)
    } catch (e: Exception) {
        0
    }
}