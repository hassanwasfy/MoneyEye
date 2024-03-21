package com.abaferas.moneyeye.domain.usecase.category

import com.abaferas.moneyeye.domain.entity.Category
import com.abaferas.moneyeye.domain.source.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CategoryUseCaseImpl @Inject constructor(
    private val repository: Repository
) : CategoryUseCase {


    override suspend fun insertCategory(category: Category) {
        repository.insertCategory(category)
    }

    override suspend fun updateCategory(category: Category) {
        repository.updateCategory(category)
    }

    override suspend fun deleteCategory(category: Category) {
        repository.deleteCategory(category)
    }

    override fun getAllCategories(): Flow<List<Category>> {
        return repository.getAllCategories()
    }
}