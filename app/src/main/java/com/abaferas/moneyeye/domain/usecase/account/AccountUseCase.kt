package com.abaferas.moneyeye.domain.usecase.account

import com.abaferas.moneyeye.domain.entity.Account
import kotlinx.coroutines.flow.Flow

interface AccountUseCase {
    suspend fun insertNewAccount(account: Account)
    suspend fun updateExistingAccount(account: Account)
    suspend fun deleteAccount(account: Account)
    suspend fun getAllUserAccounts(userId: Long): Flow<List<Account>>
}