package com.abaferas.moneyeye.data.models.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.abaferas.moneyeye.data.models.local.LocalTransaction
import com.abaferas.moneyeye.data.models.local.LocalUser
import com.abaferas.moneyeye.data.util.Constants
import kotlinx.coroutines.flow.Flow

@Dao
interface LocalUserDao {
    @Insert(entity = LocalUser::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(localUser: LocalUser)
    @Update(entity = LocalUser::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(localUser: LocalUser)
    @Delete(entity = LocalUser::class)
    suspend fun delete(localUser: LocalUser)
}