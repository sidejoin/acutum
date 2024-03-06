package com.acutum.util

import okhttp3.Dispatcher
import okhttp3.OkHttpClient

object Fetch {
    private val dispatcher = Dispatcher(
    ).apply {
        this.maxRequests = 1000
        this.maxRequestsPerHost = 250
    }
    val client: OkHttpClient = OkHttpClient.Builder().dispatcher(dispatcher).build()

}