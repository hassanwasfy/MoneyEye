package com.abaferas.moneyeye.ui.util

class EntryValidator {
    fun validateName(value: String): Boolean {
        return value.isNotEmpty() && value.isNotBlank()
    }

    fun validateEmail(value: String): Boolean {
        return true
    }

    fun validatePassword(value: String): Boolean {
        return true
    }

    fun validatePasswordConfirm(pass: String, confirm: String): Boolean {
        return pass === confirm
    }
}