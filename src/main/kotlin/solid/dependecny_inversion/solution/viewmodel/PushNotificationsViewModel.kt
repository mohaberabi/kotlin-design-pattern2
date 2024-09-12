package solid.dependecny_inversion.solution.viewmodel

import solid.dependecny_inversion.solution.repository.PushNotificationsRepository

class PushNotificationsViewModel(
    private val pushNotificationsRepository: PushNotificationsRepository,
) {
    fun send(token: String) = pushNotificationsRepository.send(token)
    fun generateToken(uid: String): String = pushNotificationsRepository.generateToken(uid)


}