package patterns.structural.proxy.quote.data

import kotlinx.coroutines.delay
import patterns.structural.proxy.quote.domain.Quote
import patterns.structural.proxy.quote.domain.QuoteRemoteDataSource

class ApiQuotesRemoteDataSource : QuoteRemoteDataSource {

    override suspend fun getQuotes(): List<Quote> {
        delay(5000L)
        return listOf(Quote(), Quote())
    }


}