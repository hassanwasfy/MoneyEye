package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.domain.utils.Constants

@Entity(
    tableName = Constants.TABLE_LOGIN,
)
data class LocalLogin(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.COLUMN_ID)
    val id: Long = 0L,
    @ColumnInfo(name = Constants.COLUMN_EMAIL)
    val email: String = "",
    @ColumnInfo(name = Constants.COLUMN_PASSWORD)
    val password: String = ""
)
