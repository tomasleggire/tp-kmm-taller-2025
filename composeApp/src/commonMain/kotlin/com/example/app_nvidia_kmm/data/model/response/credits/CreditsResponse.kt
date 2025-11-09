package com.example.app_nvidia_kmm.data.model.response.credits

import kotlinx.serialization.Serializable


@Serializable
data class CreditsResponse(
    val cast: List<CastResponse>
)