package patterns.behavioral.state.login

sealed interface UserState {


    data object SignedOut : UserState
    data object LoggedIn : UserState


}