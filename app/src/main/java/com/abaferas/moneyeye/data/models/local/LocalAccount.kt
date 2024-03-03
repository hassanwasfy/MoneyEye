package com.abaferas.moneyeye.data.models.local

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.util.TableInfo


@Entity(foreignKeys = [ForeignKey(entity = LocalUser::class, parentColumns = ["id"], childColumns = ["userId"])])
data class LocalAccount(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    val userId: Long = 0L,
    val name: String = "",
    val income: Double = 0.0,
    val expenses: List<LocalExpenses> = emptyList(),
    val totalIncome: Double = 0.0,
    val totalSpense: Double = 0.0,
    val balance: Double = 0.0,
    val form: Long = 0L,
    val to: Long = 0L
)
