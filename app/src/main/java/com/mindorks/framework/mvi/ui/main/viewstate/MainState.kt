package com.mindorks.framework.mvi.ui.main.viewstate

import com.mindorks.framework.mvi.data.model.User

sealed class MainState {

    data object Idle : MainState()
    data object Loading : MainState()
    data class Users(val user: List<User>) : MainState()
    data class Error(val error: String?) : MainState()

}