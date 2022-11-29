package com.skyme32.vegetabllance.ui.screen.vegetables

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.skyme32.vegetabllance.data.api.repository.VegetableRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VegetablesViewModel @Inject constructor(
    private val vegetableRepository: VegetableRepository
): ViewModel() {

    fun getVegetable() {
        viewModelScope.launch {
            val vegetable = vegetableRepository.getNewVegetables()
            Log.d("vegetable", vegetable.toString())
        }
    }
}