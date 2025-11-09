package com.example.app_nvidia_kmm.data.model.response.person

import com.example.app_nvidia_kmm.data.model.response.movie.MovieResponse
import kotlinx.serialization.Serializable

@Serializable
data class CombinedCreditsResponse(
    val cast: List<MovieResponse>
)