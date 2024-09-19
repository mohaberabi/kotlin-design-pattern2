package exercise.message_api.data.formatter

import exercise.message_api.domain.MessageFormatter

abstract class AbstractMessageFormatter : MessageFormatter {


    override fun format(message: String): String {
        validate(message)
        checkMessageSize(message)
        return formatInner(message)
    }

    private fun validate(message: String) = "Validated message :${message}"
    private fun checkMessageSize(message: String) = "Checked message :${message}"


    protected abstract fun formatInner(message: String): String
}