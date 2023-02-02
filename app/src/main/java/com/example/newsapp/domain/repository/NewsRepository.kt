package com.example.newsapp.domain.repository

import com.example.newsapp.data.remote.dto.NewsDto

interface NewsRepository {
    suspend fun getNews(): List<NewsDto>
}