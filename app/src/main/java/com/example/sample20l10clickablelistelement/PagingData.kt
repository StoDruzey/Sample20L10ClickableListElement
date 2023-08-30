package com.example.sample20l10clickablelistelement

sealed class PagingData<out T> {
    data class Item<T>(val data: T) : PagingData<T>()
    object Loading : PagingData<Nothing>()
}