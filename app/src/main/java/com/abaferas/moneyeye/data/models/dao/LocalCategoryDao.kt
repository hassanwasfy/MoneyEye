package com.abaferas.moneyeye.data.models.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.abaferas.moneyeye.data.models.local.LocalCategory
import com.abaferas.moneyeye.domain.utils.Constants
import kotlinx.coroutines.flow.Flow

@Dao
interface LocalCategoryDao {

    @Insert(entity = LocalCategory::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(localCategory: LocalCategory)

    @Update(entity = LocalCategory::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(localCategory: LocalCategory)

    @Delete(entity = LocalCategory::class)
    suspend fun delete(localCategory: LocalCategory)

    @Query("SELECT * FROM ${Constants.TABLE_CATEGORY}")
    fun getAllCategories(): Flow<List<LocalCategory>>

}