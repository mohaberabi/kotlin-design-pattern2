package patterns.structural.proxy.quote.data

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import patterns.structural.proxy.quote.domain.Quote
import patterns.structural.proxy.quote.domain.QuoteLocalDataSource
import patterns.structural.proxy.quote.domain.QuoteRemoteDataSource
import kotlin.system.measureTimeMillis

class QuotesProxy(
    private val localDataSource: QuoteLocalDataSource,
    private val remoteDataSource: QuoteRemoteDataSource
) {

    suspend fun getQuotes(): List<Quote> {
        if (localDataSource.isEmpty) {
            val remote = remoteDataSource.getQuotes()
            localDataSource.saveQuotes(remote)
            return remote
        } else {
            return localDataSource.getQuotes()
        }
    }
}


fun main() {


    val remote = ApiQuotesRemoteDataSource()
    val local = InMemoryQuoteLocalDataSource()
    val proxy = QuotesProxy(local, remote)


    val time = measureTimeMillis {

        runBlocking {
            proxy.getQuotes()
        }
    }
    println(time)
    val time2 = measureTimeMillis {
        runBlocking {
            proxy.getQuotes()
        }
      
    }
    println(time2)

}