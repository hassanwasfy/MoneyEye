package com.abaferas.moneyeye.data.models.local

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(foreignKeys = [ForeignKey(entity = LocalAccount::class, parentColumns = ["id"], childColumns = ["accountId"])])
data class LocalExpenses(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val accountId: Double = 0.0,
    val name: String = "",
    val time: String = "",
    val location: String = "",
    val amout: Double = 0.0,
    val unitPrice: Double = 0.0,
    val total: Double = 0.0,
    val category: String = "",
)