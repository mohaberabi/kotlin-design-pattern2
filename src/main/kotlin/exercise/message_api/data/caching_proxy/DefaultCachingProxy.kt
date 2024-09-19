package exercise.message_api.data.caching_proxy

import exercise.message_api.domain.MessageCahcingProxy
import exercise.message_api.domain.MessageRemoteSource

class DefaultCachingProxy(
    private val api: MessageRemoteSource
) : MessageCahcingProxy {


    private val cache = mutableMapOf<String, String>()
    override fun processes(message: String): String {
        return if (cache.containsKey(message)) {
            message
        } else {
            cache.getOrPut(message) { api.respond(message) }
        }
    }
}