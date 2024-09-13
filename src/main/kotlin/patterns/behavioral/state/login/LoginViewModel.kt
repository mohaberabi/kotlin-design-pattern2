package patterns.behavioral.state.login

import kotlin.random.Random

class LoginViewModel {


    private var state: UserState = UserState.SignedOut


    fun login(
        email: String,
        password: String
    ) {
        if (Random.nextBoolean()) {
            state = UserState.LoggedIn
        } else {
            println("Incorrect data")
        }
    }


    fun signOut() {
        if (state == UserState.LoggedIn) {
            state = UserState.SignedOut
        } else {
            println("You Are not signed in yet")
        }
    }


}