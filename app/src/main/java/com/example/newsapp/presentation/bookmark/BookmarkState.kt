package com.example.newsapp.presentation.bookmark

import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.usecases.news.SelectArticles


data class BookmarkState(
    val articles: List<Article> = emptyList()
)