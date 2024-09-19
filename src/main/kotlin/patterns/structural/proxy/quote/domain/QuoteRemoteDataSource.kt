package patterns.structural.proxy.quote.domain

interface QuoteRemoteDataSource {
    suspend fun getQuotes(): List<Quote>

}