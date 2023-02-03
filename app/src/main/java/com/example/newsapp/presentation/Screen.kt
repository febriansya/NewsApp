package com.example.newsapp.presentation

sealed class Screen(val route: String) {
    object NewsListScreen : Screen("new_list_screen")
    object NewsDetailScreen : Screen("new_detail_screen")
}
