package com.abaferas.moneyeye.domain.entity

data class Category(
    val id: Long = 0L,
    val name: String = "",
    val synced: Boolean = false
)