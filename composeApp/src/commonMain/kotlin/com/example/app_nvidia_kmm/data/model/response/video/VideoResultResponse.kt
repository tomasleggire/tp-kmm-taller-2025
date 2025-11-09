package com.example.app_nvidia_kmm.data.model.response.video

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoResultResponse(
    @SerialName("id") val id: String? = null,
    @SerialName("key") val key: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("site") val site: String? = null,
    @SerialName("type") val type: String? = null,
    @SerialName("official") val official: Boolean? = null
)