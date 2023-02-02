package com.example.newsapp.data.remote

import com.example.newsapp.data.remote.dto.NewsDto
import retrofit2.http.GET


interface NewsApi {
    @GET("/v2/everything")
    suspend fun getNews(): List<NewsDto>
}