package com.javy.hiring.data.source.remote

import com.javy.hiring.data.source.remote.service.CandidateApiService
import com.javy.hiring.ui.model.Candidate
import javax.inject.Inject

class CandidatesRemoteDataSource @Inject constructor(private val apiService: CandidateApiService) {
    suspend fun candidates(): List<Candidate> {
        val response = apiService.candidates()

        return mockCandidates()
    }
}

fun mockCandidates(): List<Candidate> = listOf(
    Candidate(
        id = 1,
        name = "Jane Doe",
        listId = 3
    ),
    Candidate(
        id = 2,
        name = "John Doe",
        listId = 4
    ),
    Candidate(
        id = 3,
        name = "Baby Doe",
        listId = 5
    )
)