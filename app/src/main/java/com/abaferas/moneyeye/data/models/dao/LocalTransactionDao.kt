package com.abaferas.moneyeye.data.models.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.abaferas.moneyeye.data.models.local.LocalTransaction
import com.abaferas.moneyeye.domain.utils.Constants
import kotlinx.coroutines.flow.Flow

@Dao
interface LocalTransactionDao {

    @Insert(entity = LocalTransaction::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(localTransaction: LocalTransaction)

    @Update(entity = LocalTransaction::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(localTransaction: LocalTransaction)

    @Delete(entity = LocalTransaction::class)
    suspend fun delete(localTransaction: LocalTransaction)


    @Query("SELECT * FROM ${Constants.TABLE_RECORDS} t WHERE t.accountId = :accountId")
    fun getAllAccountRecords(accountId: Long): Flow<List<LocalTransaction>>





}