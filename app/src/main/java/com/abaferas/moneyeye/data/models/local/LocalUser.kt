package com.abaferas.moneyeye.data.models.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.data.util.DataConstants


@Entity(
    tableName = DataConstants.TABLE_USER,
    primaryKeys = ["id"],)
data class LocalUser(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val synced: Boolean = false,
)
