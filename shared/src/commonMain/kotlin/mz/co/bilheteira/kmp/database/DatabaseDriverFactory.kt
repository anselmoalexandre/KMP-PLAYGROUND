package mz.co.bilheteira.kmp.database

import app.cash.sqldelight.db.SqlDriver

/**
 * Interface that provides a SqlDelight [SqlDriver] instance.
 * We will need to define this per platform.
 */
interface DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}
