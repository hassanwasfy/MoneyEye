package com.abaferas.moneyeye.data.models.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.abaferas.moneyeye.data.models.local.LocalLogin
import com.abaferas.moneyeye.domain.utils.Constants

@Dao
interface LocalLoginDao {
    @Insert(entity = LocalLogin::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(localLogin: LocalLogin)

    @Update(entity = LocalLogin::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(localLogin: LocalLogin)

    @Delete(entity = LocalLogin::class)
    suspend fun delete(localLogin: LocalLogin)

    @Query("SELECT * FROM ${Constants.TABLE_LOGIN} WHERE ${Constants.COLUMN_EMAIL} = :email")
    suspend fun getLoginByEmail(email: String): LocalLogin
}