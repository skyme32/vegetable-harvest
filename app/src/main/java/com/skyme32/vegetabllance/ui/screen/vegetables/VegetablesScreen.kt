package com.skyme32.vegetabllance.ui.screen.vegetables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
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
            )
        }
    ) { values ->
        viewModel.getVegetable()

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