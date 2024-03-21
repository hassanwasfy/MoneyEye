package com.abaferas.moneyeye.domain.usecase.record

import com.abaferas.moneyeye.domain.entity.Transaction
import com.abaferas.moneyeye.domain.source.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RecordUseCaseImpl @Inject constructor(
    private val repository: Repository
) : RecordUseCase {

    override suspend fun insertRecord(transaction: Transaction) {
        repository.insertRecord(transaction)
    }

    override suspend fun updateRecord(transaction: Transaction) {
        repository.updateRecord(transaction)
    }

    override suspend fun deleteRecord(transaction: Transaction) {
        repository.deleteRecord(transaction)
    }

    override fun getAllAccountRecords(accountId: Long): Flow<List<Transaction>> {
        return repository.getAllAccountRecords(accountId)
    }

}