package com.abaferas.moneyeye.data.models.local

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
            parentColumns = ["id"],
            childColumns = ["userId"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
    )]
)
data class LocalAccount(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val userId: Long,
    val name: String,
    val balance: Double,
    val income: String,
    val synced: Boolean = false,
)
