package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.data.util.DataConstants


@Entity(
    tableName = DataConstants.TABLE_ACCOUNT,
    primaryKeys = ["id"],
    foreignKeys = [
        ForeignKey(
            entity = LocalUser::class,
            parentColumns = [DataConstants.COLUMN_ID],
            childColumns = [DataConstants.COLUMN_USER_ID],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
    )]
)
data class LocalAccount(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = DataConstants.COLUMN_ID)
    val id: Long,
    @ColumnInfo(name = DataConstants.COLUMN_USER_ID)
    val userId: Long,
    @ColumnInfo(name = DataConstants.COLUMN_NAME)
    val name: String,
    @ColumnInfo(name = DataConstants.COLUMN_BALANCE)
    val balance: Double,
    @ColumnInfo(name = DataConstants.COLUMN_INCOME)
    val income: String,
    @ColumnInfo(name = DataConstants.COLUMN_SYNCED)
    val synced: Boolean = false,
)
