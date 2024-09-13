package patterns.behavioral.chain_of_responsiblity

import kotlin.random.Random

interface AuthenticationChecker {


    fun isAuthed(request: Request): Boolean
}


class DefaultAuthChecker() : AuthenticationChecker {


    override fun isAuthed(
        request: Request,
    ): Boolean = Random.nextBoolean()
}