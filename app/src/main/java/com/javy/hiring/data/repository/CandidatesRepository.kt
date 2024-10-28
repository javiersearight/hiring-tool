package com.javy.hiring.data.repository

import com.javy.hiring.data.source.remote.CandidatesRemoteDataSource
import com.javy.hiring.ui.model.Candidate
import javax.inject.Inject

class CandidatesRepository @Inject constructor(private val dataSource: CandidatesRemoteDataSource) {
    suspend fun candidates(): List<Candidate> = dataSource.candidates()
}