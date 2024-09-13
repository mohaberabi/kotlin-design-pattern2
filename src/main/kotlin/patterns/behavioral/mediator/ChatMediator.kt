package patterns.behavioral.mediator

import patterns.behavioral.mediator.model.ChatUser


interface ChatMediator {
    fun sendDirectMessage(
        message: String,
        from: ChatUser,
        to: ChatUser,
    )

    fun sendGroupMessage(
        message: String,
        from: ChatUser,
        groupId: String,
    )

    fun addUseToGroup(
        user: ChatUser,
        groupId: String
    )
}


