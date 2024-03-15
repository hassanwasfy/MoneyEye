package com.abaferas.moneyeye.data.models.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.data.util.DataConstants


@Entity(
    tableName = DataConstants.TABLE_CATEGORY,
    primaryKeys = ["id"],
)
data class LocalCategory(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val name: String = "",
    val synced: Boolean = false
)
