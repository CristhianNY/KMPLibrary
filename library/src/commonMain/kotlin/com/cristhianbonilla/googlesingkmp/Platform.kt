package com.cristhianbonilla.googlesingkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform