package patterns.behavioral.chain_of_responsiblity

import kotlin.random.Random


interface AuthorizationChecker {


    fun isAuthorized(request: Request): Boolean
}


class DefaultAuthorizationChecker() : AuthorizationChecker {


    override fun isAuthorized(
        request: Request,
    ): Boolean = Random.nextBoolean()
}