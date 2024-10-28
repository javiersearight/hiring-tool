package com.javy.hiring.ui.viewmodel.candidates

import com.javy.hiring.ui.model.Candidate

data class CandidatesUIState(
    val candidates: List<Candidate> = emptyList(),
    val isLoading: Boolean = true,
    val errorMessage: String? = null
) {
    val hasNoResults: Boolean
        get() = !isLoading && candidates.isEmpty() && errorMessage == null

    val hasError: Boolean
        get() = !isLoading && errorMessage != null
}