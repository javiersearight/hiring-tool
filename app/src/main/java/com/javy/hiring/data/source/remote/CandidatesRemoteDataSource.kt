package com.javy.hiring.data.source.remote

import com.javy.hiring.ui.model.Candidate

class CandidatesRemoteDataSource {
    fun candidates(): List<Candidate> = mockCandidates()
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