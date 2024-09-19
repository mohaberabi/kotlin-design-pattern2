package exercise.message_api.data

import exercise.message_api.data.facade.MessageFacade
import exercise.message_api.data.middlewares.MiddleWareHandler
import exercise.message_api.domain.model.Request
import exercise.message_api.domain.model.Response

class MessageController(
    private val handler: MiddleWareHandler,
    private val facade: MessageFacade,
) {
    fun processRequest(request: Request): Response {
        val response = handler.handle(request)
        return if (response.isDone) {
            val message = facade.processesMessage(message = request.data)
            Response.Builder()
                .status(200)
                .headers(mapOf("content-type" to "application/json"))
                .data(message)
                .build()
        } else {
            Response.Builder()
                .status(400)
                .headers(mapOf("content-type" to "application/json"))
                .error("Error")
                .build()
        }
    }
}