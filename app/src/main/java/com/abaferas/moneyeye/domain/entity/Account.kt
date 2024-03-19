package com.abaferas.moneyeye.domain.entity

data class Account(
    val id: Long = 0L,
    val userId: Long,
    val name: String,
    val balance: Double,
    val income: String,
    val synced: Boolean,
)
