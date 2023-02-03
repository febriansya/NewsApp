package com.example.newsapp.data.remote

import com.example.newsapp.common.Constants
import com.example.newsapp.data.remote.dto.NewsDto
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsApi {
    @GET("/v2/everything")
    suspend fun getNews(
        @Query("q") query: String,
        @Query("from") from: String,
        @Query("sortBy") sortBy: String,
        @Query("apiKey") apiKey: String = Constants.API_KEY
    ): List<NewsDto>
}