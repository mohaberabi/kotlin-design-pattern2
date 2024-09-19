package exercise.message_api.data.formatter

import exercise.message_api.domain.MessageFormatter

class XmlMessageFormatter : AbstractMessageFormatter() {

    override fun formatInner(message: String): String {
        return "${message} as xml"
    }
}