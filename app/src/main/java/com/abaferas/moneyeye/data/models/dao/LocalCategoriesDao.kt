package com.abaferas.moneyeye.data.models.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.abaferas.moneyeye.data.models.local.LocalCategories
import com.abaferas.moneyeye.data.util.Constants
import kotlinx.coroutines.flow.Flow

@Dao
interface LocalCategoriesDao {

    @Insert(entity = LocalCategories::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(localCategories: LocalCategories)

    @Update(entity = LocalCategories::class, onConflict = OnConflictStrategy.REPLACE)
    suspend fun update(localCategories: LocalCategories)

    @Delete(entity = LocalCategories::class)
    suspend fun delete(localCategories: LocalCategories)

    @Query("SELECT ${Constants.COLUMN_NAME} FROM ${Constants.TABLE_CATEGORY} c INNER JOIN ${Constants.TABLE_CATEGORIES} tc ON c.id = tc.categoryId WHERE tc.transactionId = :transactionId")
    fun getRecordCategories(transactionId: Long): Flow<List<String>>

}