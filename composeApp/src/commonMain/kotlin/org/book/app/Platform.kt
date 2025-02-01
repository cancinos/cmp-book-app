package org.book.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform