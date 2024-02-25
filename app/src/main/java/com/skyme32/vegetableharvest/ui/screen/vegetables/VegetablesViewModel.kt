package com.skyme32.vegetableharvest.ui.screen.vegetables

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.skyme32.vegetableharvest.data.local.model.VegetableSeason
import com.skyme32.vegetableharvest.data.repository.VegetableRepository
import com.skyme32.vegetableharvest.util.getCurrentMonth
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class VegetablesViewModel @Inject constructor(
    private val vegetableRepository: VegetableRepository
) : ViewModel() {

    val vegetables: LiveData<List<VegetableSeason>> by lazy {
        vegetableRepository.getMonthVegetablesSeson(getCurrentMonth())
    }
}