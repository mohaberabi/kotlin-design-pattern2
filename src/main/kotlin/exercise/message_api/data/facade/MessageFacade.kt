package exercise.message_api.data.facade

import exercise.message_api.data.formatter.MessageFormatterFactory
import exercise.message_api.domain.MessageAnalyzer
import exercise.message_api.domain.MessageCahcingProxy
import exercise.message_api.domain.MessageFormatter
import exercise.message_api.domain.MessgeRepository

class MessageFacade(
    private val repository: MessgeRepository,
    private val analyzer: MessageAnalyzer,
    private val proxy: MessageCahcingProxy
) {
    fun processesMessage(message: String): String {
        val analyzed = analyzer.analyze(message)
        val formatter = MessageFormatterFactory.create(analyzed)
        val formated = formatter.format(analyzed)
        repository.saveMessage(formated)
        return proxy.processes(message)
    }
}