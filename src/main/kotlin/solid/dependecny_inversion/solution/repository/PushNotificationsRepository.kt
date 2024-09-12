package solid.dependecny_inversion.solution.repository

import solid.dependecny_inversion.solution.client.PushNotificationsClient

interface PushNotificationsRepository {
    fun send(token: String)
    fun generateToken(uid: String): String
}

class DefaultPushNotificationsRepository(
    private val client: PushNotificationsClient
) : PushNotificationsRepository {
    override fun send(token: String) = client.send(token)
    override fun generateToken(uid: String): String = client.generateToken(uid)
}