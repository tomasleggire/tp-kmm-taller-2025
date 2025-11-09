package com.example.app_nvidia_kmm.data.repository

import com.example.app_nvidia_kmm.data.model.response.movie.MovieDetailResponse
import com.example.app_nvidia_kmm.data.source.remote.MovieService

class MovieRepository(
    private val movieService: MovieService
) {
    // 🧠 Lógica de negocio: obtener detalles de una película
    suspend fun getMovieDetail(movieId: Int): MovieDetailResponse {
        return movieService.getMovieDetail(movieId)
    }
}