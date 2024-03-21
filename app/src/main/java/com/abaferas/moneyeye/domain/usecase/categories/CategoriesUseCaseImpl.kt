package com.abaferas.moneyeye.domain.usecase.categories

import com.abaferas.moneyeye.domain.entity.Categories
import com.abaferas.moneyeye.domain.source.repository.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CategoriesUseCaseImpl @Inject constructor(
    private val repository: Repository
) : CategoriesUseCase {

    override suspend fun insertRecordCategories(categories: Categories) {
        repository.insertRecordCategories(categories)
    }

    override suspend fun updateRecordCategories(categories: Categories) {
        repository.updateRecordCategories(categories)
    }

    override suspend fun deleteRecordCategories(categories: Categories) {
        repository.deleteRecordCategories(categories)
    }

    override fun getRecordCategories(transactionId: Long): Flow<List<String>> {
        return repository.getRecordCategories(transactionId)
    }
}