package com.skyme32.vegetabllance.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.flowlayout.FlowRow
import com.google.accompanist.flowlayout.SizeMode
import com.skyme32.vegetabllance.data.local.model.Season
import com.skyme32.vegetabllance.ui.theme.Green200
import com.skyme32.vegetabllance.ui.theme.Green500
import com.skyme32.vegetabllance.util.parseMonths
import java.util.Locale

@Composable
fun Post(
    title: String,
    image: Int,
    listSeason: List<Season>,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.padding(8.dp, 4.dp, 8.dp, 4.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        shape = MaterialTheme.shapes.large
    ) {
        Image(
            painter = painterResource(image),
            contentDescription = title,
            modifier = Modifier
                .clip(MaterialTheme.shapes.large)
                .fillMaxWidth()
                .aspectRatio(3f / 2f)
        )
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title.lowercase()
                    .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() },
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(8.dp))
            FlowRow(
                modifier = Modifier.fillMaxWidth(),
                mainAxisSpacing = 8.dp,
                mainAxisSize = SizeMode.Wrap
            ) {
                listSeason.forEach { season ->
                    Chip(month = season.month, type = season.type)
                }
            }
        }
    }
}

@Composable
fun Chip(month: Int, type: Boolean) {
    AssistChip(
        onClick = { },
        label = {
            Text(
                text = parseMonths(month, LocalContext.current),
                color = if (type) {
                    Green500
                } else {
                    MaterialTheme.colorScheme.onSurface
                }
            )
        },
        colors = if (type) {
            AssistChipDefaults.assistChipColors(containerColor = Green200)
        } else {
            AssistChipDefaults.assistChipColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
        },
        border = if (type) {
            AssistChipDefaults.assistChipBorder(enabled = true, borderColor = Green500)
        } else {
            AssistChipDefaults.assistChipBorder(enabled = true, borderColor = MaterialTheme.colorScheme.onSurface)
        },
    )
}
