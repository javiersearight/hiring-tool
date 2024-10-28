package com.javy.hiring.ui.viewmodel.candidates

import com.javy.hiring.ui.model.Candidate

data class CandidatesUIState(
    val candidates: List<Candidate> = emptyList(),
    val isLoading: Boolean = true
)