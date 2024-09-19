package exercise.message_api.data.database

class MessageDataBase {
    private val messages = mutableListOf<String>()
    fun create(message: String) {
        messages.add(message)
    }
}