package mz.co.bilheteira.kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform