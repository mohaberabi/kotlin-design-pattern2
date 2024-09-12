package solid.dependecny_inversion.solution.client


class Fcm {

    fun sendPush(token: String) {
    }

    fun generateTokenForUser(uid: String): String {
        return "token"
    }


}

class FcmNotificationsClient(
    private val fcm: Fcm
) : PushNotificationsClient {
    override fun send(token: String) = fcm.sendPush(token)

    override fun generateToken(uid: String): String = fcm.generateTokenForUser(uid)

}