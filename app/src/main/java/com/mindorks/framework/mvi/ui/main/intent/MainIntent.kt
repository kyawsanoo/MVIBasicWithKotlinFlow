package com.mindorks.framework.mvi.ui.main.intent

sealed class MainIntent {

    data object FetchUser : MainIntent()

}