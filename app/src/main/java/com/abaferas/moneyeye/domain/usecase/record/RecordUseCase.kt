package com.abaferas.moneyeye.domain.usecase.record

import com.abaferas.moneyeye.domain.entity.Transaction
import kotlinx.coroutines.flow.Flow

interface RecordUseCase {

    suspend fun insertRecord(transaction: Transaction)
    suspend fun updateRecord(transaction: Transaction)
    suspend fun deleteRecord(transaction: Transaction)
    fun getAllAccountRecords(accountId: Long): Flow<List<Transaction>>
}