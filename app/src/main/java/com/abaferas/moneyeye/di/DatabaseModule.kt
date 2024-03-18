package com.abaferas.moneyeye.di

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.abaferas.moneyeye.data.source.local.RoomLocalDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Singleton
    @Provides
    fun initializeDatabase(context: Context) = Room.databaseBuilder(
            context, RoomLocalDatabase::class.java, "moneyeye",).build()

    @Provides
    fun accountDao(database: RoomLocalDatabase) = database.accountDao()

    @Provides
    fun categoryDao(database: RoomLocalDatabase) = database.categoryDao()

    @Provides
    fun categoriesDao(database: RoomLocalDatabase) = database.categoriesDao()

    @Provides
    fun transactionDao(database: RoomLocalDatabase) = database.transactionDao()

    @Provides
    fun userDao(database: RoomLocalDatabase) = database.userDao()

    @Provides
    fun appContext(@ApplicationContext context: Context) = context

}