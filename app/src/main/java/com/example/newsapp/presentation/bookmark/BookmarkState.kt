package com.example.newsapp.presentation.bookmark

import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.usecases.news.SelectArticles

class BookmarkState(
    val articles: List<Article> = emptyList()
) {
}