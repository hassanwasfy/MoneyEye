package com.abaferas.moneyeye.domain.utils

class EntryValidator {
    fun validateName(value: String): Boolean {
        return value.isNotEmpty() && value.isNotBlank()
    }

    fun validateEmail(value: String): Boolean {
        val emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
        return Regex(emailRegex).matches(value) && value.isNotEmpty()
    }

    fun validatePassword(value: String): Boolean {
        val passwordRegex = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$"
        return Regex(passwordRegex).matches(value)
    }


    fun validatePasswordConfirm(pass: String, confirm: String): Boolean {
        return pass == confirm
    }
}