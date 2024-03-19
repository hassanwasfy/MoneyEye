package com.abaferas.moneyeye.domain.entity

data class Category(
    val id: Long = 0L,
    val transactionId: Long,
    val categoryId: Long,
    val name: String,
    val synced: Boolean
)