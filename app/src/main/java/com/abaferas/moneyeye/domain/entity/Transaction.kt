package com.abaferas.moneyeye.domain.entity

data class Transaction(
    val id: Long,
    val accountId: Long,
    val name: String,
    val amount: Double,
    val quantity: Int,
    val total: Double,
    val type: String,
    val repeat: String,
    val synced: Boolean,
    val date: String,
    val dueDate: String,
    val note: String,
)
