package com.abaferas.moneyeye.data.models.local

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.abaferas.moneyeye.data.util.DataConstants


@Entity(
    tableName = DataConstants.TABLE_TRANSACTION,
    primaryKeys = ["id"],
    foreignKeys = [
        ForeignKey(
            entity = LocalAccount::class,
            parentColumns = ["id"],
            childColumns = ["accountId"],
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        )]
)
data class LocalTransaction(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val accountId: Long = 0L,
    val name: String = "",
    val amount: Double = 0.0,
    val type: String = "",
    val repeat: String = "",
    val synced: Boolean = false,
    val date: String = "",
    val dueDate: String = ""
)
