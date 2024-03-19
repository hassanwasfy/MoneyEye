package com.abaferas.moneyeye.domain.entity

data class User(
    val id: Long = 0L,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val synced: Boolean,
)
