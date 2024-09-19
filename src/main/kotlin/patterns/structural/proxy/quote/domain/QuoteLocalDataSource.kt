package patterns.structural.proxy.quote.domain

interface QuoteLocalDataSource {

    suspend fun saveQuotes(quotes: List<Quote>)

    suspend fun getQuotes(): List<Quote>


    val isEmpty: Boolean
}