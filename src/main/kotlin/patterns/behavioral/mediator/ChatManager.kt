package patterns.behavioral.mediator

import patterns.behavioral.mediator.model.ChatUser

class ChatManager : ChatMediator {


    private val groups = mutableMapOf<String, MutableList<ChatUser>>()
    override fun sendDirectMessage(
        message: String,
        from: ChatUser,
        to: ChatUser
    ) = from.sendMessage(message = message, to = to)

    override fun sendGroupMessage(
        message: String,
        from: ChatUser, groupId: String
    ) {
        val users = groups.values.reduce { acc, chatUsers -> (acc + chatUsers).toMutableList() }
        users.forEach { it.recieveGroupMessage(group = groupId, message = message, from = from) }
    }

    override fun addUseToGroup(
        user: ChatUser,
        groupId: String
    ) {

        val list = groups[groupId]?.apply { add(user) } ?: mutableListOf(user)
        groups[groupId] = list.toSet().toMutableList()
    }
}

private fun main() {
    val mediator = ChatManager()
    repeat(10) {
        val user = ChatUser(name = "Loser$it", chatMediator = mediator)
        mediator.addUseToGroup(
            user,
            groupId = "1"
        )
    }
    val user = ChatUser(name = "Loser-1092", chatMediator = mediator)
    mediator.sendGroupMessage(groupId = "1", message = "jhsadvhjasdvjhsadvjsahdvjashd", from = user)
}