package exercise.message_api.data.middlewares

import exercise.message_api.domain.model.MiddleWareHandlerResponse
import exercise.message_api.domain.model.Request

class AuthenticationMiddleWare : AbstractMiddleWareHandler() {


    override fun handle(
        request: Request,
    ): MiddleWareHandlerResponse {
        return if (request.user.authed) {
            super.handle(request)
        } else {
            MiddleWareHandlerResponse("False", false)
        }
    }
}