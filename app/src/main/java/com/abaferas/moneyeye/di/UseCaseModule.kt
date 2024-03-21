package com.abaferas.moneyeye.di

import com.abaferas.moneyeye.domain.source.repository.Repository
import com.abaferas.moneyeye.domain.usecase.account.AccountUseCase
import com.abaferas.moneyeye.domain.usecase.account.AccountUseCaseImpl
import com.abaferas.moneyeye.domain.usecase.categories.CategoriesUseCase
import com.abaferas.moneyeye.domain.usecase.categories.CategoriesUseCaseImpl
import com.abaferas.moneyeye.domain.usecase.category.CategoryUseCase
import com.abaferas.moneyeye.domain.usecase.category.CategoryUseCaseImpl
import com.abaferas.moneyeye.domain.usecase.record.RecordUseCase
import com.abaferas.moneyeye.domain.usecase.record.RecordUseCaseImpl
import com.abaferas.moneyeye.domain.usecase.user.UserUseCase
import com.abaferas.moneyeye.domain.usecase.user.UserUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    fun provideAccountsUseCase(repository: Repository): AccountUseCase {
        return AccountUseCaseImpl(repository)
    }

    @Provides
    fun provideCategoriesUseCase(repository: Repository): CategoriesUseCase {
        return CategoriesUseCaseImpl(repository)
    }

    @Provides
    fun provideCategoryUseCase(repository: Repository): CategoryUseCase {
        return CategoryUseCaseImpl(repository)
    }

    @Provides
    fun provideRecordUseCase(repository: Repository): RecordUseCase {
        return RecordUseCaseImpl(repository)
    }

    @Provides
    fun provideUserUseCase(repository: Repository): UserUseCase {
        return UserUseCaseImpl(repository)
    }

}