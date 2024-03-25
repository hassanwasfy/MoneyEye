package com.abaferas.moneyeye.di

import android.content.Context
import com.abaferas.moneyeye.data.models.dao.LocalAccountDao
import com.abaferas.moneyeye.data.models.dao.LocalCategoriesDao
import com.abaferas.moneyeye.data.models.dao.LocalCategoryDao
import com.abaferas.moneyeye.data.models.dao.LocalLoginDao
import com.abaferas.moneyeye.data.models.dao.LocalTransactionDao
import com.abaferas.moneyeye.data.models.dao.LocalUserDao
import com.abaferas.moneyeye.data.source.local.datastore.DataStoreManagement
import com.abaferas.moneyeye.data.source.local.room.RoomDataSource
import com.abaferas.moneyeye.data.source.remote.SupabaseDataSource
import com.abaferas.moneyeye.data.source.repository.RepositoryImpl
import com.abaferas.moneyeye.domain.source.local.LocalDataSource
import com.abaferas.moneyeye.domain.source.remote.RemoteDataSource
import com.abaferas.moneyeye.domain.source.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    fun provideRoomDataSource(
        accountDao: LocalAccountDao,
        transactionDao: LocalTransactionDao,
        userDao: LocalUserDao,
        categoriesDao: LocalCategoriesDao,
        categoryDao: LocalCategoryDao,
        loginDao: LocalLoginDao,
        dataStoreManagement: DataStoreManagement
    ): LocalDataSource {
        return RoomDataSource(
            accountDao,
            transactionDao,
            userDao,
            categoriesDao,
            categoryDao,
            loginDao,
            dataStoreManagement
        )
    }

    @Provides
    fun provideSupabaseDataSource(remoteDataSource: RemoteDataSource): RemoteDataSource {
        return SupabaseDataSource()
    }

    @Provides
    fun provideRepository(localDataSource: LocalDataSource): Repository {
        return RepositoryImpl(localDataSource)
    }

    @Provides
    @Singleton
    fun provideDataStoreManagement(
        context: Context
    ): DataStoreManagement {
        return DataStoreManagement(context)
    }
}