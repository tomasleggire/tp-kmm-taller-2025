package com.example.app_nvidia_kmm.data.model.response.movie

import kotlinx.serialization.Serializable

@Serializable
data class MovieForActorResponse(
    val cast: List<MovieResponse>? = null
)