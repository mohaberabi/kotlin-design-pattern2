package patterns.behavioral.chain_of_responsiblity


interface RequestProcessor {
    fun processesRequest(
        request: Request
    ): Response
}


class DefaultRequestProcessor(
    private val secuirutyChecker: DefaultSecuirutyChecker,
    private val authorizationChecker: DefaultAuthorizationChecker,
    private val authenticationChecker: AuthenticationChecker,
) : RequestProcessor {
    override fun processesRequest(
        request: Request,
    ): Response {
        val canProcesses = secuirutyChecker.passedCheckes(request)
                && authorizationChecker.isAuthorized(request)
                && authenticationChecker.isAuthed(request)
        val response = if (canProcesses) "Allowed" else "Not Allowed"
        return Response(response)
    }

}