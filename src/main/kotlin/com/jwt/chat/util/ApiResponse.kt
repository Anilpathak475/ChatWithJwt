package com.jwt.chat.util

data class ApiResponse<T>(
    val status: Int,
    val message: String,
    val data: T?
)