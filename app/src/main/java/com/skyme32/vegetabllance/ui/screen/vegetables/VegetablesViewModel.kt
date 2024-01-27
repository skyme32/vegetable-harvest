package com.skyme32.vegetabllance.ui.screen.vegetables

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.skyme32.vegetabllance.data.local.model.VegetableSeason
import com.skyme32.vegetabllance.data.repository.VegetableRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class VegetablesViewModel @Inject constructor(
    private val vegetableRepository: VegetableRepository
) : ViewModel() {

    val vegetables: LiveData<List<VegetableSeason>> by lazy {
        vegetableRepository.getAllVegetables()
    }
}