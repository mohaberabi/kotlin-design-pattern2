package exercise.message_api.domain

interface MessageCahcingProxy {


    fun processes(message: String): String
}