package com.abaferas.moneyeye.ui.screen.auth.signup

interface SignupInteraction {

    fun onFirstNameChange(value: String)
    fun onLastNameChange(value: String)
    fun onEmailChange(value: String)
    fun onPasswordChange(value: String)
    fun onPasswordConfirmChange(value: String)
    fun onSignupClick()
    fun onLoginClick()
    fun onAnonymousLoginClick()
}