package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.data.util.DataConstants


@Entity(
    tableName = DataConstants.TABLE_USER,
    primaryKeys = [DataConstants.COLUMN_ID],)
data class LocalUser(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = DataConstants.COLUMN_ID)
    val id: Long,
    @ColumnInfo(name = DataConstants.COLUMN_FIRST_NAME)
    val firstName: String,
    @ColumnInfo(name = DataConstants.COLUMN_LAST_NAME)
    val lastName: String,
    @ColumnInfo(name = DataConstants.COLUMN_EMAIL)
    val email: String,
    @ColumnInfo(name = DataConstants.COLUMN_PASSWORD)
    val password: String,
    @ColumnInfo(name = DataConstants.COLUMN_SYNCED)
    val synced: Boolean = false,
)
