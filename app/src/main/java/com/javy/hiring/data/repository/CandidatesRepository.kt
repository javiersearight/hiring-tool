package com.javy.hiring.data.repository

import com.javy.hiring.data.source.remote.CandidatesRemoteDataSource
import com.javy.hiring.ui.model.Candidate

class CandidatesRepository {
    private val dataSource: CandidatesRemoteDataSource = CandidatesRemoteDataSource()
    fun candidates(): List<Candidate> = dataSource.candidates()
}