package solid.dependecny_inversion.solution.client

interface PushNotificationsClient {


    fun send(token: String)

    fun generateToken(uid: String): String
}


