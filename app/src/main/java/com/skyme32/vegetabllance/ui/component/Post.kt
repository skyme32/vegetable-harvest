package com.skyme32.vegetabllance.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.google.accompanist.flowlayout.FlowRow
import com.google.accompanist.flowlayout.SizeMode
import com.skyme32.vegetabllance.data.local.model.Season
import com.skyme32.vegetabllance.ui.theme.Green200
import com.skyme32.vegetabllance.ui.theme.Green500
import com.skyme32.vegetabllance.util.parseMonths
import java.util.*

@ExperimentalMaterial3Api
@Composable
fun Post(
    title: String,
    description: String,
    image: String,
    listSeason: List<Season>,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        shape = MaterialTheme.shapes.large
    ) {
        Image(
            painter = rememberAsyncImagePainter(
                model = image
            ),
            contentDescription = null,
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
            Text(
                text = description.lowercase()
                    .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() },
                style = MaterialTheme.typography.bodyMedium
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

@OptIn(ExperimentalMaterial3Api::class)
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
            AssistChipDefaults.assistChipBorder(borderColor = Green500)
        } else {
            AssistChipDefaults.assistChipBorder(borderColor = MaterialTheme.colorScheme.onSurface)
        },
    )
}
