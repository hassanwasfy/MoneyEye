package com.abaferas.moneyeye.data.models.local

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import com.abaferas.moneyeye.data.util.DataConstants

@Entity(
    tableName = DataConstants.TABLE_CATEGORIES,
    foreignKeys = [
        ForeignKey(
            entity = LocalAccount::class,
            parentColumns = [DataConstants.COLUMN_ID],
            childColumns = [DataConstants.COLUMN_ACCOUNT_ID],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = LocalCategory::class,
            parentColumns = [DataConstants.COLUMN_ID],
            childColumns = [DataConstants.COLUMN_CATEGORY_ID],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )
    ]
)
data class LocalCategories(
    @ColumnInfo(name = DataConstants.COLUMN_ACCOUNT_ID)
    val accountId: Long = 0L,
    @ColumnInfo(name = DataConstants.COLUMN_CATEGORY_ID)
    val categoryId: Long = 0L
)