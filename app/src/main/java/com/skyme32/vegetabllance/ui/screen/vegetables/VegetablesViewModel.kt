package com.skyme32.vegetabllance.ui.screen.vegetables

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.skyme32.vegetabllance.data.local.model.VegetableSeason
import com.skyme32.vegetabllance.data.repository.VegetableRepository
import com.skyme32.vegetabllance.util.curentMonth
import com.skyme32.vegetabllance.util.parseLanguage
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VegetablesViewModel @Inject constructor(
    private val vegetableRepository: VegetableRepository
) : ViewModel() {

    init {
        viewModelScope.launch {
            vegetableRepository.refreshVegetables()
        }
    }

    val vegetables: LiveData<List<VegetableSeason>> by lazy {
        vegetableRepository.getAllVegetables(parseLanguage(), curentMonth())
    }
}