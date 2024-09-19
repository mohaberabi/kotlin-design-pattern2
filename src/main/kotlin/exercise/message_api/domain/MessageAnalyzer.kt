package exercise.message_api.domain

import exercise.message_api.domain.model.Request

interface MessageAnalyzer {


    fun analyze(requestData: String): String
}