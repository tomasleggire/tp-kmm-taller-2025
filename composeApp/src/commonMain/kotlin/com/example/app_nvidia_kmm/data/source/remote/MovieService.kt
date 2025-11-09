package com.example.app_nvidia_kmm.data.source.remote

import com.example.app_nvidia_kmm.data.model.response.movie.MovieDetailResponse
import com.example.app_nvidia_kmm.network.HttpClientFactory
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*

class MovieService(private val clientFactory: HttpClientFactory) {

    private val client = clientFactory.createClient()
    private val baseUrl = "https://api.themoviedb.org/3"
    private val apiKey = "e2ab90f0b66f67e0d4876aa1ea96918f"

    suspend fun getMovieDetail(movieId: Int): MovieDetailResponse {
        val response: HttpResponse = client.get("$baseUrl/movie/$movieId") {
            parameter("api_key", apiKey)
            accept(ContentType.Application.Json)
        }
        return response.body()
    }
}