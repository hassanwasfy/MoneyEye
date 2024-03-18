package com.abaferas.moneyeye.data.models.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.abaferas.moneyeye.data.models.local.LocalAccount
import com.abaferas.moneyeye.domain.utils.Constants
import kotlinx.coroutines.flow.Flow

@Dao
interface LocalAccountDao {

    @Insert(entity = LocalAccount::class,onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNewAccount(account: LocalAccount)

    @Update(entity = LocalAccount::class,onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateExistingAccount(account: LocalAccount)

    @Delete(entity = LocalAccount::class)
    suspend fun deleteAccount(account: LocalAccount)

    @Query("SELECT * FROM ${Constants.TABLE_ACCOUNT} WHERE ${Constants.COLUMN_USER_ID} = :userId")
    fun getAllUserAccounts(userId: Long): Flow<List<LocalAccount>>




}