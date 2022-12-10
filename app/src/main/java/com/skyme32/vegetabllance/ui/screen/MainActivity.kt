package com.skyme32.vegetabllance.ui.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skyme32.vegetabllance.ui.component.Post
import com.skyme32.vegetabllance.ui.theme.VegetabllanceTheme
import dagger.hilt.android.AndroidEntryPoint
import com.skyme32.vegetabllance.R

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            VegetabllanceTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(
                                title = {
                                    Text(
                                        text = stringResource(id = R.string.app_name),
                                        fontSize = 20.sp,
                                        modifier = Modifier.fillMaxWidth()
                                    )
                                },
                            )
                        }
                    ) { values ->
                        LazyColumn(contentPadding = values) {
                            items(10) {
                                Post(
                                    title = "Bacon ipsum",
                                    description = "Bacon ipsum dolor amet pork shankle beef andouille ball tip. Meatball corned beef swine, strip steak bacon jerky doner tongue biltong pork loin drumstick sausage hamburger burgdoggen.",
                                    modifier = Modifier.padding(8.dp),
                                    listMonths = arrayListOf(1,2,3,6,7,8,12),
                                    image = "https://free-images.com/md/1c45/cucumbers_vegetables_cucumber_food_2.jpg"
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

