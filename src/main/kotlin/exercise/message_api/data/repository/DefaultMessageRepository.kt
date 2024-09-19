package exercise.message_api.data.repository

import exercise.message_api.data.database.MessageDataBase
import exercise.message_api.domain.MessageRemoteSource
import exercise.message_api.domain.MessgeRepository

class DefaultMessageRepository(
    private val dataBase: MessageDataBase,
    private val api: MessageRemoteSource
) : MessgeRepository {
    override fun saveMessage(message: String) = dataBase.create(message)
}