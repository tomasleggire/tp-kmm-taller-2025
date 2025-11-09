package com.example.app_nvidia_kmm.data.model.response.movie

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class MovieSimilarResponse(
    @SerialName("page") val page: Int,
    @SerialName("results") val results: List<MovieResponse>,
    @SerialName("total_pages") val totalPages: Int,
    @SerialName("total_results") val totalResults: Int
)