package com.example.app_nvidia_kmm.data.model.response.movie

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MovieDetailResponse(
    @SerialName("adult") val adult: Boolean?,
    @SerialName("backdrop_path") val backdropPath: String? = null,
    @SerialName("belongs_to_collection") val belongsToCollection: BelongsToCollectionResponse? = null,
    @SerialName("budget") val budget: Int? = null,
    @SerialName("genres") val genres: List<GenreResponse>? = null,
    @SerialName("homepage") val homepage: String? = null,
    @SerialName("id") val id: Int? = null,
    @SerialName("imdb_id") val imdbId: String? = null,
    @SerialName("origin_country") val originCountry: List<String>? = null,
    @SerialName("original_language") val originalLanguage: String? = null,
    @SerialName("original_title") val originalTitle: String? = null,
    @SerialName("overview") val overview: String? = null,
    @SerialName("popularity") val popularity: Double? = null,
    @SerialName("poster_path") val posterPath: String? = null,
    @SerialName("production_companies") val productionCompanies: List<ProductionCompanyResponse>? = null,
    @SerialName("production_countries") val productionCountries: List<ProductionCountryResponse>? = null,
    @SerialName("release_date") val releaseDate: String? = null,
    @SerialName("revenue") val revenue: Int? = null,
    @SerialName("runtime") val runtime: Int? = null,
    @SerialName("spoken_languages") val spokenLanguages: List<SpokenLanguageResponse>? = null,
    @SerialName("status") val status: String? = null,
    @SerialName("tagline") val tagline: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("video") val video: Boolean? = null,
    @SerialName("vote_average") val voteAverage: Double? = null,
    @SerialName("vote_count") val voteCount: Int? = null
)

@Serializable
data class BelongsToCollectionResponse(
    @SerialName("id") val id: Int? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("poster_path") val posterPath: String? = null,
    @SerialName("backdrop_path") val backdropPath: String? = null
)

@Serializable
data class GenreResponse(
    @SerialName("id") val id: Int? = null,
    @SerialName("name") val name: String? = null
)

// Add the rest of your response data classes here, ensuring all fields are nullable.
// This is crucial for handling unpredictable API responses.
@Serializable
data class ProductionCompanyResponse(
    @SerialName("id") val id: Int? = null,
    @SerialName("logo_path") val logoPath: String? = null,
    @SerialName("name") val name: String? = null,
    @SerialName("origin_country") val originCountry: String? = null
)

@Serializable
data class ProductionCountryResponse(
    @SerialName("iso_3166_1") val iso3166_1: String? = null,
    @SerialName("name") val name: String? = null
)

@Serializable
data class SpokenLanguageResponse(
    @SerialName("english_name") val englishName: String? = null,
    @SerialName("iso_639_1") val iso639_1: String? = null,
    @SerialName("name") val name: String? = null
)