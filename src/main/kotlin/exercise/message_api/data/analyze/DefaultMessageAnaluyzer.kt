package exercise.message_api.data.analyze

import exercise.message_api.domain.MessageAnalyzer
import kotlin.random.Random

class DefaultMessageAnalyzer : MessageAnalyzer {
    override fun analyze(
        requestData: String,
    ): String = "Analyed Message :${requestData}"
}