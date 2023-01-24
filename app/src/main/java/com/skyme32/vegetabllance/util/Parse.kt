package com.skyme32.vegetabllance.util

import android.content.Context
import com.skyme32.vegetabllance.R
import java.util.*

fun parseMonths(month: Int, context: Context): String {
    Locale.getDefault().displayLanguage;
    return when (month) {
        1 -> context.resources.getString(R.string.january)
        2 -> context.resources.getString(R.string.february)
        3 -> context.resources.getString(R.string.march)
        4 -> context.resources.getString(R.string.april)
        5 -> context.resources.getString(R.string.may)
        6 -> context.resources.getString(R.string.june)
        7 -> context.resources.getString(R.string.july)
        8 -> context.resources.getString(R.string.august)
        9 -> context.resources.getString(R.string.september)
        10 -> context.resources.getString(R.string.october)
        11 -> context.resources.getString(R.string.november)
        12 -> context.resources.getString(R.string.december)
        else -> context.resources.getString(R.string.na)
    }
}

fun parseLanguage(): String {
    return when (Locale.getDefault().language.lowercase()) {
        "es" -> "es"
        "ca" -> "ca"
        else -> "en"
    }
}


