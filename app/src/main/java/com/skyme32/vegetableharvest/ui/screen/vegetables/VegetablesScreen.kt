package com.skyme32.vegetableharvest.ui.screen.vegetables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.skyme32.vegetableharvest.R
import com.skyme32.vegetableharvest.ui.component.Item

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VegetablesScreen(
    viewModel: VegetablesViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        fontSize = 20.sp,
                        color = MaterialTheme.colorScheme.background,
                        modifier = Modifier.fillMaxWidth()
                    )
                },
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onBackground
                )
            )
        }
    ) { values ->
        val vegetables by viewModel.vegetables.observeAsState(arrayListOf())

        LazyColumn(
            modifier = Modifier.padding(0.dp,4.dp),
            contentPadding = values) {
            items(vegetables.size) { index ->

                Item(
                    vegetable = vegetables[index].vegetable,
                    listSeason = vegetables[index].seasons
                )
            }
        }
    }
}