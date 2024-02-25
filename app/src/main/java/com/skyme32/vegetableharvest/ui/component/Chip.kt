package com.skyme32.vegetableharvest.ui.component

import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.skyme32.vegetableharvest.data.local.model.Season
import com.skyme32.vegetableharvest.ui.theme.Green200
import com.skyme32.vegetableharvest.ui.theme.Green500
import com.skyme32.vegetableharvest.util.parseMonths

@Composable
fun Chip(
    season: Season,
) {
    AssistChip(
        onClick = { },
        label = {
            Text(
                text = parseMonths(season.month, LocalContext.current),
                color = if (season.type) {
                    Green500
                } else {
                    MaterialTheme.colorScheme.onSurface
                }
            )
        },
        colors = if (season.type) {
            AssistChipDefaults.assistChipColors(containerColor = Green200)
        } else {
            AssistChipDefaults.assistChipColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
        },
        border = if (season.type) {
            AssistChipDefaults.assistChipBorder(enabled = true, borderColor = Green500)
        } else {
            AssistChipDefaults.assistChipBorder(enabled = true, borderColor = MaterialTheme.colorScheme.onSurface)
        },
    )
}