package com.example.newsapp.presentation.details.components

sealed class DetailsEvent {
    object SaveArticle : DetailsEvent()
}