package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.domain.utils.Constants


@Entity(
    tableName = Constants.TABLE_ACCOUNT,
    foreignKeys = [
        ForeignKey(
            entity = LocalUser::class,
            parentColumns = [Constants.COLUMN_ID],
            childColumns = [Constants.COLUMN_USER_ID],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
    )]
)
data class LocalAccount(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.COLUMN_ID)
    val id: Long,
    @ColumnInfo(name = Constants.COLUMN_USER_ID)
    val userId: Long,
    @ColumnInfo(name = Constants.COLUMN_NAME)
    val name: String,
    @ColumnInfo(name = Constants.COLUMN_BALANCE)
    val balance: Double,
    @ColumnInfo(name = Constants.COLUMN_INCOME)
    val income: String,
    @ColumnInfo(name = Constants.COLUMN_SYNCED)
    val synced: Boolean = false,
)
