package com.example.newsapp.data.remote.dto

import com.example.newsapp.domain.model.News

data class NewsDto(
    val source: String? = null,
    val id: String,
    val name: String,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val title: String,
    val url: String,
    val urlToImage: String
)

fun NewsDto.toNews(): News {
    return News(
        id = id,
        name = name,
        author = author,
        content = content,
        description = description,
        publishedAt = publishedAt,
        title = title,
        url = url,
        urlToImage = urlToImage
    )
}

