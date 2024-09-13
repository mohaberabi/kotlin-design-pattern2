package patterns.behavioral.chain_of_responsiblity

import kotlin.random.Random

interface SecuirityChecker {


    fun passedCheckes(request: Request): Boolean
}


class DefaultSecuirutyChecker : SecuirityChecker {


    override fun passedCheckes(request: Request): Boolean = Random.nextBoolean()
}


