@file:OptIn(
    ExperimentalLayoutApi::class,
    ExperimentalMaterial3Api::class,
    ExperimentalLayoutApi::class,
)

package com.skyme32.vegetabllance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.skyme32.vegetabllance.model.MyImage
import com.skyme32.vegetabllance.ui.theme.VegetabllanceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VegetabllanceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val image1 = MyImage(
                        resId = R.drawable.eggplant,
                        title = "Eggplant",
                        tags =  listOf(
                            "Diciembre",
                            "Enero",
                            "Febrero"
                        )
                    )
                    val image2 = MyImage(
                        resId = R.drawable.zucchini,
                        title = "Zucchini",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )
                    val image3 = MyImage(
                        resId = R.drawable.tomatoes,
                        title = "Tomatoes",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )
                    val image4 = MyImage(
                        resId = R.drawable.peas,
                        title = "Peas",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )
                    val image5 = MyImage(
                        resId = R.drawable.beans,
                        title = "Beans",
                        tags =  listOf(
                            "Diciembre",
                            "Enero",
                            "Febrero"
                        )
                    )
                    val image6 = MyImage(
                        resId = R.drawable.pepper,
                        title = "Pepper",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )
                    val image7 = MyImage(
                        resId = R.drawable.avocado,
                        title = "Avocado",
                        tags =  listOf(
                            "Diciembre",
                            "Enero",
                            "Febrero"
                        )
                    )
                    val image8 = MyImage(
                        resId = R.drawable.chard,
                        title = "Chard",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )
                    val image9 = MyImage(
                        resId = R.drawable.garlic,
                        title = "Garlic",
                        tags =  listOf(
                            "Enero",
                            "Febrero"
                        )
                    )
                    val image10 = MyImage(
                        resId = R.drawable.artichoke,
                        title = "Artichoke",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )
                    val image11 = MyImage(
                        resId = R.drawable.broccoli,
                        title = "Broccoli",
                        tags =  listOf(
                            "Diciembre",
                            "Enero",
                            "Febrero"
                        )
                    )
                    val image12 = MyImage(
                        resId = R.drawable.celery,
                        title = "Celery",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )
                    val image13 = MyImage(
                        resId = R.drawable.pumpkin,
                        title = "Pumpkin",
                        tags =  listOf(
                            "Diciembre",
                            "Enero",
                            "Febrero"
                        )
                    )
                    val image14 = MyImage(
                        resId = R.drawable.onion,
                        title = "Onion",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )
                    val image15 = MyImage(
                        resId = R.drawable.thistle,
                        title = "Thistle",
                        tags =  listOf(
                            "Diciembre",
                            "Enero",
                            "Febrero"
                        )
                    )
                    val image16 = MyImage(
                        resId = R.drawable.red_cabbage,
                        title = "Red cabbage",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )
                    val image17 = MyImage(
                        resId = R.drawable.cauliflower,
                        title = "cauliflower",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )
                    val image18 = MyImage(
                        resId = R.drawable.endive,
                        title = "cauliflower",
                        tags =  listOf(
                            "Diciembre",
                            "Enero"
                        )
                    )

                    ListColumn(listOf(image1, image2, image3, image4, image5, image6, image7,
                        image8, image9, image10,image11, image12, image13, image14, image15,
                        image16, image17, image18))
                }
            }
        }
    }
}

@Composable
fun ListColumn(
    images: List<MyImage>,
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(
            items = images,
            key = { it.id }
        ) {
                image ->
            ImageDetails(image)
        }
    }
}

@Composable
fun ImageDetails(
    image: MyImage,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(image.resId),
                contentDescription = image.title,
                modifier = Modifier.height(84.dp).width(84.dp).padding(8.dp),
                contentScale = ContentScale.FillWidth
            )
            Column {
                Text(
                    text = image.title,
                    modifier = Modifier.fillMaxWidth()
                )
                FlowRow(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    image.tags.forEach { tag ->
                        SuggestionChip(
                            label = {
                                Text(text = tag)
                            },
                            onClick = {},
                        )
                    }
                }
            }
        }
    }
}
