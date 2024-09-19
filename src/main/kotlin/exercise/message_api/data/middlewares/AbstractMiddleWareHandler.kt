package exercise.message_api.data.middlewares

import exercise.message_api.domain.model.MiddleWareHandlerResponse
import exercise.message_api.domain.model.Request

abstract class AbstractMiddleWareHandler(

) : MiddleWareHandler {

    private var next: MiddleWareHandler? = null

    override fun setNext(handler: MiddleWareHandler): MiddleWareHandler {
        next = handler
        return next!!
    }

    override fun handle(request: Request): MiddleWareHandlerResponse {

        return next?.handle(request) ?: MiddleWareHandlerResponse("Done", true)
    }
}