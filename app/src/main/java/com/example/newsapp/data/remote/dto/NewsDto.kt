package com.example.newsapp.data.remote.dto

import com.example.newsapp.domain.model.News

data class NewsDto(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)

data class Article(
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
)


fun NewsDto.toNews(): List<News> {
    return articles.map {
        News(
            title = it.title,
            description = it.description,
            url = it.url,
            urlToImage = it.urlToImage,
            publishedAt = it.publishedAt,
            content = it.content
        )
    }
}

