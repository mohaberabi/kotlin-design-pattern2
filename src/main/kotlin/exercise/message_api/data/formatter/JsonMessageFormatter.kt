package exercise.message_api.data.formatter

import exercise.message_api.domain.MessageFormatter

class JsonMessageFormatter : AbstractMessageFormatter() {
    override fun formatInner(message: String): String {
        return "${message} as Json"
    }
}