package com.abaferas.moneyeye.domain.usecase.categories

import com.abaferas.moneyeye.domain.entity.Categories
import kotlinx.coroutines.flow.Flow

interface CategoriesUseCase {

    suspend fun insertRecordCategories(categories: Categories)
    suspend fun updateRecordCategories(categories: Categories)
    suspend fun deleteRecordCategories(categories: Categories)
    fun getRecordCategories(transactionId: Long): Flow<List<String>>

}