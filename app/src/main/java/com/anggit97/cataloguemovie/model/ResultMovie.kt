package com.anggit97.cataloguemovie.model


data class ResultMovie(
    var backdropPath: Int?,
    var id: Int?,
    var overview: String?,
    var popularity: Double?,
    var releaseDate: String?,
    var title: String?,
    var voteAverage: Double?,
    var voteCount: Int?
)