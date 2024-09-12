package solid.dependecny_inversion.solution.client

class OneSignal {

    fun sendPush(token: String) {

    }

    fun generateTokenForUser(uid: String): String {
        return "token"
    }
}

class OneSignalPushNotificationsClient(
    private val fcm: Fcm
) : PushNotificationsClient {
    override fun send(token: String) = fcm.sendPush(token)
    override fun generateToken(uid: String): String = fcm.generateTokenForUser(uid)

}