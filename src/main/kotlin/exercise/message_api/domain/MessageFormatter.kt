package exercise.message_api.domain

interface MessageFormatter {


    fun format(message: String): String
}