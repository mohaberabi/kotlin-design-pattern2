package patterns.behavioral.mediator.model

import patterns.behavioral.mediator.ChatMediator

data class ChatGroup(
    val id: String,
    val users: MutableSet<String>
)

class ChatUser(
    private val name: String,
    private val chatMediator: ChatMediator,
) {
    fun recieveMessage(
        from: String,
        message: String
    ) = println("You got a new message :${message} from ${from}")

    fun recieveGroupMessage(
        from: ChatUser,
        group: String,
        message: String
    ) = println("You got a new message :${message} from ${from.name} on goupr $group")

    fun sendMessage(
        message: String,
        to: ChatUser
    ) {
        chatMediator.sendDirectMessage(
            message = message,
            from = this,
            to = to
        )
    }

    fun sendGroupMessage(
        group: String,
        message: String
    ) {
        chatMediator.sendGroupMessage(
            message = message,
            groupId = group,
            from = this
        )
    }

}

