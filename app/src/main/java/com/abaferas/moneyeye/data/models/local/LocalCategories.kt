package com.abaferas.moneyeye.data.models.local

import androidx.room.Entity
import androidx.room.ForeignKey
import com.abaferas.moneyeye.data.util.DataConstants

@Entity(
    tableName = DataConstants.TABLE_CATEGORIES,
    foreignKeys = [
        ForeignKey(
            entity = LocalAccount::class,
            parentColumns = ["id"],
            childColumns = ["accountId"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        ),
        ForeignKey(
            entity = LocalCategory::class,
            parentColumns = ["id"],
            childColumns = ["categoryId"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )
    ]
)
data class LocalCategories(
    val accountId: Long = 0L,
    val categoryId: Long = 0L
)
