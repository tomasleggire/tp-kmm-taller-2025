package com.example.app_nvidia_kmm.data.repository

import com.example.app_nvidia_kmm.cache.MovieCache
import com.example.app_nvidia_kmm.cache.MovieEntity
import com.example.app_nvidia_kmm.data.model.movie.MovieDetailResponse
import com.example.app_nvidia_kmm.data.source.remote.MovieService

class MovieRepository(
    private val movieService: MovieService,
    private val cache: MovieCache
) {
    suspend fun getMovieDetail(movieId: Int): MovieDetailResponse? {
        return try {
            val movieDetail = movieService.getMovieDetail(movieId)

            val entity = MovieEntity(
                id = movieDetail.id?.toLong() ?: 0L,
                title = movieDetail.title ?: "",
                overview = movieDetail.overview ?: "",
                posterPath = movieDetail.posterPath ?: ""
            )
            cache.insertMovies(listOf(entity))
            movieDetail
        } catch (e: Exception) {
            val cached = cache.getAllMovies().firstOrNull { it.id.toInt() == movieId }
            cached?.let {
                MovieDetailResponse(
                    id = it.id.toInt(),
                    title = it.title,
                    overview = it.overview,
                    posterPath = it.posterPath
                )
            }
        }
    }
}
