package com.abaferas.moneyeye.data.source.local.room

import com.abaferas.moneyeye.data.models.dao.LocalAccountDao
import com.abaferas.moneyeye.data.models.dao.LocalCategoriesDao
import com.abaferas.moneyeye.data.models.dao.LocalCategoryDao
import com.abaferas.moneyeye.data.models.dao.LocalTransactionDao
import com.abaferas.moneyeye.data.models.dao.LocalUserDao
import com.abaferas.moneyeye.data.models.local.LocalAccount
import com.abaferas.moneyeye.data.models.local.LocalCategories
import com.abaferas.moneyeye.data.models.local.LocalCategory
import com.abaferas.moneyeye.data.models.local.LocalTransaction
import com.abaferas.moneyeye.data.models.local.LocalUser
import com.abaferas.moneyeye.data.source.local.datastore.DataStoreManagement
import com.abaferas.moneyeye.domain.source.local.LocalDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RoomDataSource @Inject constructor(
    private val accountDao: LocalAccountDao,
    private val transactionDao: LocalTransactionDao,
    private val userDao: LocalUserDao,
    private val categoriesDao: LocalCategoriesDao,
    private val categoryDao: LocalCategoryDao,
    private val dataStoreManagement: DataStoreManagement
): LocalDataSource {
    override suspend fun insertNewAccount(account: LocalAccount) {
        accountDao.insertNewAccount(account)
    }

    override suspend fun updateExistingAccount(account: LocalAccount) {
        accountDao.updateExistingAccount(account)
    }

    override suspend fun deleteAccount(account: LocalAccount) {
        accountDao.deleteAccount(account)
    }

    override fun getAllUserAccounts(userId: Long): Flow<List<LocalAccount>> {
        return accountDao.getAllUserAccounts(userId)
    }

    override suspend fun insertRecordCategories(localCategories: LocalCategories) {
        categoriesDao.insert(localCategories)
    }

    override suspend fun updateRecordCategories(localCategories: LocalCategories) {
        categoriesDao.update(localCategories)
    }

    override suspend fun deleteRecordCategories(localCategories: LocalCategories) {
        categoriesDao.delete(localCategories)
    }

    override fun getRecordCategories(transactionId: Long): Flow<List<String>> {
        return categoriesDao.getRecordCategories(transactionId)
    }

    override suspend fun insertCategory(localCategory: LocalCategory) {
        categoryDao.insert(localCategory)
    }

    override suspend fun updateCategory(localCategory: LocalCategory) {
        categoryDao.update(localCategory)
    }

    override suspend fun deleteCategory(localCategory: LocalCategory) {
        categoryDao.delete(localCategory)
    }

    override fun getAllCategories(): Flow<List<LocalCategory>> {
        return categoryDao.getAllCategories()
    }

    override suspend fun insertRecord(localTransaction: LocalTransaction) {
        transactionDao.insert(localTransaction)
    }

    override suspend fun updateRecord(localTransaction: LocalTransaction) {
        transactionDao.update(localTransaction)
    }

    override suspend fun deleteRecord(localTransaction: LocalTransaction) {
        transactionDao.delete(localTransaction)
    }

    override fun getAllAccountRecords(accountId: Long): Flow<List<LocalTransaction>> {
        return transactionDao.getAllAccountRecords(accountId)
    }

    override suspend fun insertUser(localUser: LocalUser) {
        userDao.insert(localUser)
    }

    override suspend fun updateUser(localUser: LocalUser) {
        userDao.update(localUser)
    }

    override suspend fun deleteUser(localUser: LocalUser) {
        userDao.delete(localUser)
    }

    override suspend fun setLoginState(state: Boolean) {
        dataStoreManagement.setLoginStatus(state)
    }

    override suspend fun getLoginState(): Boolean {
        return dataStoreManagement.getLoginStatus()
    }
}