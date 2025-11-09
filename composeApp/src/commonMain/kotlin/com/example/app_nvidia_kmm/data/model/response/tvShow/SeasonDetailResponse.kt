package com.example.app_nvidia_kmm.data.model.response.tvShow

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SeasonDetailResponse(
    val id: Int,
    val name: String? = null,
    @SerialName("season_number") val seasonNumber: Int,
    val overview: String? = null,
    val episodes: List<EpisodeResponse> = emptyList()
)