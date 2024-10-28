package com.javy.hiring.ui.viewmodel.candidates

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.javy.hiring.data.repository.CandidatesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CandidatesViewModel @Inject constructor(
    private val repository: CandidatesRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(CandidatesUIState())
    val uiState = _uiState.asStateFlow()

    init {
        candidates()
    }

    private fun candidates() {
        viewModelScope.launch {
            runCatching {
                repository.candidates()
            }.onSuccess { candidates ->
                _uiState.update {
                    it.copy(
                        candidates = candidates,
                        isLoading = false
                    )
                }
            }.onFailure {
                // implement error state
            }
        }
    }
}