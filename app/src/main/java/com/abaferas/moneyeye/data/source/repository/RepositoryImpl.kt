package com.abaferas.moneyeye.data.source.repository

import com.abaferas.moneyeye.data.models.mapper.toDomainModel
import com.abaferas.moneyeye.data.models.mapper.toDtoModel
import com.abaferas.moneyeye.domain.entity.Account
import com.abaferas.moneyeye.domain.entity.Categories
import com.abaferas.moneyeye.domain.entity.Category
import com.abaferas.moneyeye.domain.entity.Transaction
import com.abaferas.moneyeye.domain.entity.User
import com.abaferas.moneyeye.domain.source.local.LocalDataSource
import com.abaferas.moneyeye.domain.source.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val localDataSource: LocalDataSource
) : Repository {
    override suspend fun insertNewAccount(account: Account) {
        localDataSource.insertNewAccount(account.toDtoModel())
    }

    override suspend fun updateExistingAccount(account: Account) {
        localDataSource.updateExistingAccount(account.toDtoModel())
    }

    override suspend fun deleteAccount(account: Account) {
        localDataSource.deleteAccount(account.toDtoModel())
    }

    override fun getAllUserAccounts(userId: Long): Flow<List<Account>> {
        return localDataSource.getAllUserAccounts(userId).map { it.toDomainModel() }
    }

    override suspend fun insertRecordCategories(categories: Categories) {
        localDataSource.insertRecordCategories(categories.toDtoModel())
    }

    override suspend fun updateRecordCategories(categories: Categories) {
        localDataSource.updateRecordCategories(categories.toDtoModel())
    }

    override suspend fun deleteRecordCategories(categories: Categories) {
        localDataSource.deleteRecordCategories(categories.toDtoModel())
    }

    override fun getRecordCategories(transactionId: Long): Flow<List<String>> {
        return localDataSource.getRecordCategories(transactionId)
    }

    override suspend fun insertCategory(category: Category) {
        localDataSource.insertCategory(category.toDtoModel())
    }

    override suspend fun updateCategory(category: Category) {
        localDataSource.updateCategory(category.toDtoModel())
    }

    override suspend fun deleteCategory(category: Category) {
        localDataSource.deleteCategory(category.toDtoModel())
    }

    override fun getAllCategories(): Flow<List<Category>> {
        return localDataSource.getAllCategories().map { it.toDomainModel() }
    }

    override suspend fun insertRecord(transaction: Transaction) {
        localDataSource.insertRecord(transaction.toDtoModel())
    }

    override suspend fun updateRecord(transaction: Transaction) {
        localDataSource.updateRecord(transaction.toDtoModel())
    }

    override suspend fun deleteRecord(transaction: Transaction) {
        localDataSource.deleteRecord(transaction.toDtoModel())
    }

    override fun getAllAccountRecords(accountId: Long): Flow<List<Transaction>> {
        return localDataSource.getAllAccountRecords(accountId).map { it.toDomainModel() }
    }

    override suspend fun insertUser(user: User) {
        localDataSource.insertUser(user.toDtoModel())
    }

    override suspend fun updateUser(user: User) {
        localDataSource.updateUser(user.toDtoModel())
    }

    override suspend fun deleteUser(user: User) {
        localDataSource.deleteUser(user.toDtoModel())
    }

    override suspend fun setLoginState(state: Boolean) {
        localDataSource.setLoginState(state)
    }

    override suspend fun getLoginState(): Boolean {
        return localDataSource.getLoginState()
    }
}