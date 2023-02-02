package com.example.newsapp.data.repository

import com.example.newsapp.data.remote.NewsApi
import com.example.newsapp.data.remote.dto.NewsDto
import com.example.newsapp.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(
    private val api: NewsApi
) : NewsRepository {

    override suspend fun getNews(): List<NewsDto> {
        TODO("Not yet implemented")
    }
}