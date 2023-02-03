package com.example.newsapp.presentation.news_list

import com.example.newsapp.domain.model.News

data class NewsListState(
    val isLoading: Boolean = false,
    val news: List<News> = emptyList(),
    val error: String = ""
)