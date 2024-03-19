package com.skyme32.vegetableharvest.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.skyme32.vegetableharvest.R
import com.skyme32.vegetableharvest.data.local.model.Season
import com.skyme32.vegetableharvest.data.local.model.Vegetable
import com.skyme32.vegetableharvest.ui.theme.LocalCustomColorsPalette
import com.skyme32.vegetableharvest.util.getCurrentMonth
import java.util.Locale

@Composable
fun Item(
    vegetable: Vegetable,
    listSeason: List<Season>
) {
    val season = listSeason.find { season -> getCurrentMonth() == season.month }

    Card(
        modifier = Modifier.padding(8.dp, 4.dp, 8.dp, 4.dp).fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = if (season!!.type) { LocalCustomColorsPalette.current.extraColor1 } else { MaterialTheme.colorScheme.surfaceVariant },
        ),
        shape = MaterialTheme.shapes.large
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
        ){
            Spacer(modifier = Modifier.width(4.dp))
            Image(
                painter = painterResource(getDrawableId(vegetable.name)),
                contentDescription = stringResource(getStringId(vegetable.name)),
                modifier = Modifier
                    .clip(MaterialTheme.shapes.large)
                    .width(74.dp)
                    .height(74.dp)
                    .weight(1f)
                    .padding(6.dp)
            )
            Text(
                modifier = Modifier.padding(8.dp).weight(3f),
                text = stringResource(getStringId(vegetable.name))
                    .lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.ROOT) else it.toString() },
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}