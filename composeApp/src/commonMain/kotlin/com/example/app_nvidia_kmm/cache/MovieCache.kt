package com.example.app_nvidia_kmm.cache

import app.cash.sqldelight.db.SqlDriver
import com.example.app_nvidia_kmm.cache.AppDatabase
import comexampleappnvidiakmm.cache.MovieEntity

class MovieCache(driver: SqlDriver) {
    private val database = AppDatabase(driver)
    private val movieQueries = database.moviesQueries

    fun insertMovies(movies: List<MovieEntity>) {
        movies.forEach { movie ->
            movieQueries.insertMovie(
                id = movie.id,
                title = movie.title,
                overview = movie.overview,
                posterPath = movie.posterPath
            )
        }
    }

    fun getAllMovies(): List<MovieEntity> {
        return movieQueries.selectAll().executeAsList()
    }

    fun clearMovies() {
        movieQueries.deleteAll()
    }
}