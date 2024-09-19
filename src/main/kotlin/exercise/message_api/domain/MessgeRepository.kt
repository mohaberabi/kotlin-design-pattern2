package exercise.message_api.domain

import exercise.message_api.domain.model.Response

interface MessgeRepository {

    fun saveMessage(message: String)
}