package com.javy.hiring.ui.screen.candidates

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.javy.hiring.data.source.remote.mockCandidates
import com.javy.hiring.ui.model.Candidate

@Composable
fun CandidateList(candidates: List<Candidate>) {
    LazyVerticalGrid(columns = GridCells.Fixed(1)) {
        items(candidates.size) {
            CandidateCard(candidates[it])
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CandidateListPreview() {
    CandidateList(mockCandidates())
}