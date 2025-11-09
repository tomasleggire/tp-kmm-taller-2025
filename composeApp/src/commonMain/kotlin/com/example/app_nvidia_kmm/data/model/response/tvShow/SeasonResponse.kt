package com.example.app_nvidia_kmm.data.model.response.tvShow

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SeasonResponse(
    @SerialName("season_number") val seasonNumber: Int,
    @SerialName("episode_count") val episodeCount: Int? = null,
    @SerialName("poster_path") val posterPath: String? = null,
    val name: String? = null
)