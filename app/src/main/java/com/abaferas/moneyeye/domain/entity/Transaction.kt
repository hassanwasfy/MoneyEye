package com.abaferas.moneyeye.domain.entity

data class Transaction(
    val id: Long = 0L,
    val accountId: Long,
    val name: String,
    val amount: Double,
    val type: String,
    val repeat: String,
    val synced: Boolean,
    val date: String,
    val dueDate: String
)
