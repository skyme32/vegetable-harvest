package com.skyme32.vegetabllance.ui.screen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import com.skyme32.vegetabllance.data.local.model.Vegetable
import com.skyme32.vegetabllance.ui.screen.vegetables.VegetablesViewModel
import com.skyme32.vegetabllance.ui.theme.VegetabllanceTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VegetabllanceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(
    name: String,
    viewModel: VegetablesViewModel = hiltViewModel()
) {
    Button(onClick = {
        viewModel.getVegetable()
    }) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    VegetabllanceTheme {
        Greeting("Android")
    }
}