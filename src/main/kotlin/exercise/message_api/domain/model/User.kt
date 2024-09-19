package exercise.message_api.domain.model

data class User(

    val name: String,
    var authed: Boolean,
    var authorized: Boolean,
    var passedChecks: Boolean
)
