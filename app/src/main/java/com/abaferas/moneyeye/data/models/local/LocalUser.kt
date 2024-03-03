package com.abaferas.moneyeye.data.models.local

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class LocalUser(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val name: String = "",
    val userName: String = "",
    val email: String = "",
    val password: String = "",
    val account: List<LocalAccount> = emptyList()
)