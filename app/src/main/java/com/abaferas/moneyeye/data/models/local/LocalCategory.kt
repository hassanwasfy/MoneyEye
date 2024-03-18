package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.data.util.Constants


@Entity(
    tableName = Constants.TABLE_CATEGORY,
)
data class LocalCategory(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.COLUMN_ID)
    val id: Long = 0L,
    @ColumnInfo(name = Constants.COLUMN_NAME)
    val name: String = "",
    @ColumnInfo(name = Constants.COLUMN_SYNCED)
    val synced: Boolean = false
)