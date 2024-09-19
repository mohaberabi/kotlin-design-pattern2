package patterns.structural.proxy.quote.data

import patterns.structural.proxy.quote.domain.Quote
import patterns.structural.proxy.quote.domain.QuoteLocalDataSource

class InMemoryQuoteLocalDataSource : QuoteLocalDataSource {

    private val quotes = mutableListOf<Quote>()
    override suspend fun getQuotes(): List<Quote> {
        return quotes
    }

    override suspend fun saveQuotes(quotes: List<Quote>) {
        this.quotes.addAll(quotes)
    }

    override val isEmpty: Boolean
        get() = quotes.isEmpty()
}