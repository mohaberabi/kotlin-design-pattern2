package exercise.message_api.domain

import exercise.message_api.domain.model.Response

interface MessageRemoteSource {


    fun respond(message: String): String
}