package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.domain.utils.Constants


@Entity(
    tableName = Constants.TABLE_RECORDS,
    foreignKeys = [
        ForeignKey(
            entity = LocalAccount::class,
            parentColumns = [Constants.COLUMN_ID],
            childColumns = [Constants.COLUMN_ACCOUNT_ID],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )]
)
data class LocalTransaction(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.COLUMN_ID)
    val id: Long = 0L,
    @ColumnInfo(name = Constants.COLUMN_ACCOUNT_ID)
    val accountId: Long = 0L,
    @ColumnInfo(name = Constants.COLUMN_NAME)
    val name: String = "",
    @ColumnInfo(name = Constants.COLUMN_AMOUNT)
    val amount: Double = 0.0,
    @ColumnInfo(name = Constants.COLUMN_QUANTITY)
    val quantity: Int = 0,
    @ColumnInfo(name = Constants.COLUMN_TOTAL)
    val total: Double = 0.0,
    @ColumnInfo(name = Constants.COLUMN_TYPE)
    val type: String = "",
    @ColumnInfo(name = Constants.COLUMN_REPEAT)
    val repeat: String = "",
    @ColumnInfo(name = Constants.COLUMN_SYNCED)
    val synced: Boolean = false,
    @ColumnInfo(name = Constants.COLUMN_DATE)
    val date: String = "",
    @ColumnInfo(name = Constants.COLUMN_DUE_DATE)
    val dueDate: String = "",
    @ColumnInfo(name = Constants.COLUMN_NOTE)
    val note: String = "",
)
