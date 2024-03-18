package com.abaferas.moneyeye.di

import com.abaferas.moneyeye.data.source.local.RoomDataSource
import com.abaferas.moneyeye.data.source.remote.SupabaseDataSource
import com.abaferas.moneyeye.data.source.repository.RepositoryImpl
import com.abaferas.moneyeye.domain.source.local.LocalDataSource
import com.abaferas.moneyeye.domain.source.remote.RemoteDataSource
import com.abaferas.moneyeye.domain.source.repository.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    fun provideRoomDataSource(localDataSource: LocalDataSource): LocalDataSource {
        return RoomDataSource()
    }

    @Provides
    fun provideSupabaseDataSource(remoteDataSource: RemoteDataSource): RemoteDataSource {
        return SupabaseDataSource()
    }

    @Provides
    fun provideRepository(repository: Repository): Repository {
        return RepositoryImpl()
    }
}