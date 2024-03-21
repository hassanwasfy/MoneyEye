package com.abaferas.moneyeye.domain.usecase.category

import com.abaferas.moneyeye.domain.entity.Category
import kotlinx.coroutines.flow.Flow

interface CategoryUseCase {

    suspend fun insertCategory(category: Category)

    suspend fun updateCategory(category: Category)

    suspend fun deleteCategory(category: Category)

    fun getAllCategories(): Flow<List<Category>>

}