package com.ucb.myapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform