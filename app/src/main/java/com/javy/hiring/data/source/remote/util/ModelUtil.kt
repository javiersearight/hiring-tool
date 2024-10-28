package com.javy.hiring.data.source.remote.util

import com.javy.hiring.data.source.remote.model.CandidateRemote
import com.javy.hiring.ui.model.Candidate

fun CandidateRemote.candidate() =
    Candidate(
        id = id,
        name = name ?: "",
        listId = listId
    )

fun List<CandidateRemote>.filterByNameNotNullOrEmpty() =
    this.filter {
        !it.name.isNullOrEmpty()
    }

fun List<CandidateRemote>.sortByListIdThenName() =
    this.sortedWith(
        compareBy<CandidateRemote> { it.listId }
            .thenBy { it.name }
    )

fun List<CandidateRemote>.mapToCandidate() =
    this.map { candidate ->
        candidate.candidate()
    }
