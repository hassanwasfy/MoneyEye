package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.data.util.DataConstants


@Entity(
    tableName = DataConstants.TABLE_CATEGORY,
    primaryKeys = [DataConstants.COLUMN_ID],
)
data class LocalCategory(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = DataConstants.COLUMN_ID)
    val id: Long = 0L,
    @ColumnInfo(name = DataConstants.COLUMN_NAME)
    val name: String = "",
    @ColumnInfo(name = DataConstants.COLUMN_SYNCED)
    val synced: Boolean = false
)