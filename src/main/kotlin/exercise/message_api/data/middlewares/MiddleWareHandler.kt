package exercise.message_api.data.middlewares

import exercise.message_api.domain.model.MiddleWareHandlerResponse
import exercise.message_api.domain.model.Request

interface MiddleWareHandler {


    fun setNext(handler: MiddleWareHandler): MiddleWareHandler


    fun handle(request: Request): MiddleWareHandlerResponse
}