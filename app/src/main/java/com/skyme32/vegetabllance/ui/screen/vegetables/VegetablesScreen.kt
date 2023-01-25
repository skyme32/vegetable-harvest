package com.skyme32.vegetabllance.ui.screen.vegetables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.skyme32.vegetabllance.R
import com.skyme32.vegetabllance.ui.component.Post

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

        LazyColumn(contentPadding = values) {
            items(vegetables.size) { index ->
                val vegetable = vegetables[index]
                Post(
                    title = vegetable.name,
                    description = vegetable.description.toString(),
                    modifier = Modifier.padding(8.dp),
                    listMonths = vegetable.seasons.map { it.month },
                    image = vegetable.vegetable.image.toString()
                )
            }
        }
    }
}