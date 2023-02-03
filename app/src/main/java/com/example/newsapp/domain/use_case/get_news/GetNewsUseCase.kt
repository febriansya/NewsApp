package com.example.newsapp.domain.use_case.get_news

import com.example.newsapp.common.Resource
import com.example.newsapp.data.remote.dto.toNews
import com.example.newsapp.domain.model.News
import com.example.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject


class GetNewsUseCase @Inject constructor(
    private val repository: NewsRepository
) {
    operator fun invoke(): Flow<Resource<List<News>>> = flow {
        try {
            emit(Resource.Loading<List<News>>())
            val news = repository.getNews().map { it.toNews() }
        } catch (e: HttpException) {
            emit(Resource.Error<List<News>>(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error<List<News>>("Couldn't reach server. check your internet connection"))
        }
    }
}