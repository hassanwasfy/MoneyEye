package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.domain.utils.Constants

@Entity(
    tableName = Constants.TABLE_CATEGORIES,
    foreignKeys = [
        ForeignKey(
            entity = LocalTransaction::class,
            parentColumns = [Constants.COLUMN_ID],
            childColumns = [Constants.COLUMN_TRANSACTION_ID],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        ),
    ]
)
data class LocalCategories(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = Constants.COLUMN_ID)
    val id: Long = 0L,
    @ColumnInfo(name = Constants.COLUMN_TRANSACTION_ID)
    val transactionId: Long = 0L,
    @ColumnInfo(name = Constants.COLUMN_CATEGORY_ID)
    val categoryId: Long = 0L
)