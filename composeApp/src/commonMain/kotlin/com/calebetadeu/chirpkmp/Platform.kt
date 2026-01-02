package com.calebetadeu.chirpkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform