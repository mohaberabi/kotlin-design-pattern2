package exercise.message_api.data.formatter

class MessageFormatterFactory {
    companion object {
        fun create(message: String) = when {
            message.contains("xml") -> XmlMessageFormatter()
            message.contains("json") -> JsonMessageFormatter()
            else -> throw IllegalArgumentException("Can not parse")
        }
    }
}