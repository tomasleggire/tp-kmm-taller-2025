package com.example.app_nvidia_kmm.data.model.response.tvShow

import com.example.app_nvidia_kmm.data.model.response.tvShow.TvShowResponse
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TVShowTopRatedResponse(
    @SerialName("page") val page: Int,
    @SerialName("results") val results: List<TvShowResponse>,
    @SerialName("total_pages") val totalPages: Int,
    @SerialName("total_results") val totalResults: Int
)
