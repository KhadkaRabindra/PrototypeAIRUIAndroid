package com.example.prototypeairuiandroid.model

import java.util.Date

data class Article(
    val headline: String,
    val title: String,
    val body: String,
    val writtenAt: String = Date().toString(),
)