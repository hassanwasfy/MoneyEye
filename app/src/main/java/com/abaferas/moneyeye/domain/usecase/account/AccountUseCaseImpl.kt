package com.abaferas.moneyeye.domain.usecase.account

import com.abaferas.moneyeye.domain.entity.Account
import com.abaferas.moneyeye.domain.source.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AccountUseCaseImpl @Inject constructor(
    private val repository: Repository
) : AccountUseCase {

    override suspend fun insertNewAccount(account: Account) {
        repository.insertNewAccount(account)
    }

    override suspend fun updateExistingAccount(account: Account) {
        repository.updateExistingAccount(account)
    }

    override suspend fun deleteAccount(account: Account) {
        repository.deleteAccount(account)
    }

    override suspend fun getAllUserAccounts(userId: Long): Flow<List<Account>> {
        return repository.getAllUserAccounts(userId)
    }
}