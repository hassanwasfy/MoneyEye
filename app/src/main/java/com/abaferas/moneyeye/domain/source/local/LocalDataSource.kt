package com.abaferas.moneyeye.domain.source.local

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.abaferas.moneyeye.data.models.local.LocalAccount
import com.abaferas.moneyeye.data.models.local.LocalCategories
import com.abaferas.moneyeye.data.models.local.LocalCategory
import com.abaferas.moneyeye.data.models.local.LocalTransaction
import com.abaferas.moneyeye.data.models.local.LocalUser
import com.abaferas.moneyeye.domain.utils.Constants
import kotlinx.coroutines.flow.Flow

interface LocalDataSource {

    suspend fun insertNewAccount(account: LocalAccount)
    suspend fun updateExistingAccount(account: LocalAccount)
    suspend fun deleteAccount(account: LocalAccount)
    fun getAllUserAccounts(userId: Long): Flow<List<LocalAccount>>
    suspend fun insertRecordCategories(localCategories: LocalCategories)
    suspend fun updateRecordCategories(localCategories: LocalCategories)
    suspend fun deleteRecordCategories(localCategories: LocalCategories)
    fun getRecordCategories(transactionId: Long): Flow<List<String>>
    suspend fun insertCategory(localCategory: LocalCategory)
    suspend fun updateCategory(localCategory: LocalCategory)
    suspend fun deleteCategory(localCategory: LocalCategory)
    fun getAllCategories(): Flow<List<LocalCategory>>
    suspend fun insertRecord(localTransaction: LocalTransaction)
    suspend fun updateRecord(localTransaction: LocalTransaction)
    suspend fun deleteRecord(localTransaction: LocalTransaction)
    fun getAllAccountRecords(accountId: Long): Flow<List<LocalTransaction>>
    suspend fun insertUser(localUser: LocalUser)
    suspend fun updateUser(localUser: LocalUser)
    suspend fun deleteUser(localUser: LocalUser)
}