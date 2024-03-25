package com.abaferas.moneyeye.domain.source.repository

import com.abaferas.moneyeye.domain.entity.Account
import com.abaferas.moneyeye.domain.entity.Categories
import com.abaferas.moneyeye.domain.entity.Category
import com.abaferas.moneyeye.domain.entity.Login
import com.abaferas.moneyeye.domain.entity.Transaction
import com.abaferas.moneyeye.domain.entity.User
import kotlinx.coroutines.flow.Flow

interface Repository {
    suspend fun insertNewAccount(account: Account)
    suspend fun updateExistingAccount(account: Account)
    suspend fun deleteAccount(account: Account)
    fun getAllUserAccounts(userId: Long): Flow<List<Account>>
    suspend fun insertRecordCategories(categories: Categories)
    suspend fun updateRecordCategories(categories: Categories)
    suspend fun deleteRecordCategories(categories: Categories)
    fun getRecordCategories(transactionId: Long): Flow<List<String>>
    suspend fun insertCategory(category: Category)
    suspend fun updateCategory(category: Category)
    suspend fun deleteCategory(category: Category)
    fun getAllCategories(): Flow<List<Category>>
    suspend fun insertRecord(transaction: Transaction)
    suspend fun updateRecord(transaction: Transaction)
    suspend fun deleteRecord(transaction: Transaction)
    fun getAllAccountRecords(accountId: Long): Flow<List<Transaction>>
    suspend fun insertUser(user: User)
    suspend fun updateUser(user: User)
    suspend fun deleteUser(user: User)
    suspend fun insertLogin(login: Login)
    suspend fun updateLogin(login: Login)
    suspend fun deleteLogin(login: Login)
    suspend fun getLoginByEmail(email: String): Login
    suspend fun setLoginState(state: Boolean)
    suspend fun getLoginState(): Boolean
}