package com.javy.hiring.ui.viewmodel.candidates

import androidx.lifecycle.ViewModel
import com.javy.hiring.data.repository.CandidatesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CandidatesViewModel: ViewModel() {
    private val repository: CandidatesRepository = CandidatesRepository()

    private val _uiState = MutableStateFlow(CandidatesUIState())
    val uiState = _uiState.asStateFlow()

    init {
        candidates()
    }

    private fun candidates() {
        val list = repository.candidates()
        _uiState.update {
            it.copy(
                candidates = list,
                isLoading = false
            )
        }
    }
}