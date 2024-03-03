package com.abaferas.moneyeye.data.models.local

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class LocalCategory(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val name: String = "",
    val dateCreated: String = "",
)
