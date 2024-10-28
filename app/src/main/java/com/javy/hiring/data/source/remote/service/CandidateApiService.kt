package com.javy.hiring.data.source.remote.service

import com.javy.hiring.data.source.remote.model.CandidateRemote
import retrofit2.Response
import retrofit2.http.GET

interface CandidateApiService {

    @GET("hiring.json")
    suspend fun candidates(): Response<List<CandidateRemote>>
}