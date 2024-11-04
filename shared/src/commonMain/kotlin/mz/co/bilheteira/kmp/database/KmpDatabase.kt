package mz.co.bilheteira.kmp.database

internal class Database(
    databaseDriverFactory: DatabaseDriverFactory,
) {
    private val database = KmpDatabase(databaseDriverFactory.createDriver())
    private val dbQuery =  database.kmpDatabaseQueries
}
