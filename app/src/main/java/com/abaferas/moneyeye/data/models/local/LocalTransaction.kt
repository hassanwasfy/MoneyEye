package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.data.util.DataConstants


@Entity(
    tableName = DataConstants.TABLE_TRANSACTION,
    primaryKeys = [DataConstants.COLUMN_ID],
    foreignKeys = [
        ForeignKey(
            entity = LocalAccount::class,
            parentColumns = [DataConstants.COLUMN_ID],
            childColumns = [DataConstants.COLUMN_ACCOUNT_ID],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )]
)
data class LocalTransaction(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = DataConstants.COLUMN_ID)
    val id: Long = 0L,
    @ColumnInfo(name = DataConstants.COLUMN_ACCOUNT_ID)
    val accountId: Long = 0L,
    @ColumnInfo(name = DataConstants.COLUMN_NAME)
    val name: String = "",
    @ColumnInfo(name = DataConstants.COLUMN_AMOUNT)
    val amount: Double = 0.0,
    @ColumnInfo(name = DataConstants.COLUMN_TYPE)
    val type: String = "",
    @ColumnInfo(name = DataConstants.COLUMN_REPEAT)
    val repeat: String = "",
    @ColumnInfo(name = DataConstants.COLUMN_SYNCED)
    val synced: Boolean = false,
    @ColumnInfo(name = DataConstants.COLUMN_DATE)
    val date: String = "",
    @ColumnInfo(name = DataConstants.COLUMN_DUE_DATE)
    val dueDate: String = ""
)
