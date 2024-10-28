package com.javy.hiring.data.source.remote

import com.javy.hiring.data.source.remote.service.CandidateApiService
import com.javy.hiring.data.source.remote.util.filterByNameNotNullOrEmpty
import com.javy.hiring.data.source.remote.util.mapToCandidate
import com.javy.hiring.data.source.remote.util.sortByListIdThenName
import com.javy.hiring.ui.model.Candidate
import javax.inject.Inject

class CandidatesRemoteDataSource @Inject constructor(private val apiService: CandidateApiService) {
    suspend fun candidates(): List<Candidate> {
        val response = apiService.candidates()

        return response.body()?.filterByNameNotNullOrEmpty()
            ?.sortByListIdThenName()
            ?.mapToCandidate()
            ?: emptyList()
    }
}