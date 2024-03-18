package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.data.util.Constants


@Entity(tableName = Constants.TABLE_USER)
data class LocalUser(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.COLUMN_ID)
    val id: Long,
    @ColumnInfo(name = Constants.COLUMN_FIRST_NAME)
    val firstName: String,
    @ColumnInfo(name = Constants.COLUMN_LAST_NAME)
    val lastName: String,
    @ColumnInfo(name = Constants.COLUMN_EMAIL)
    val email: String,
    @ColumnInfo(name = Constants.COLUMN_PASSWORD)
    val password: String,
    @ColumnInfo(name = Constants.COLUMN_SYNCED)
    val synced: Boolean = false,
)
