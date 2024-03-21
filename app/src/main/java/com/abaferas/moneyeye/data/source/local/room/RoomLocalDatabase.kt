package com.abaferas.moneyeye.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.abaferas.moneyeye.data.models.dao.LocalAccountDao
import com.abaferas.moneyeye.data.models.dao.LocalCategoriesDao
import com.abaferas.moneyeye.data.models.dao.LocalCategoryDao
import com.abaferas.moneyeye.data.models.dao.LocalTransactionDao
import com.abaferas.moneyeye.data.models.dao.LocalUserDao
import com.abaferas.moneyeye.data.models.local.LocalAccount
import com.abaferas.moneyeye.data.models.local.LocalCategories
import com.abaferas.moneyeye.data.models.local.LocalCategory
import com.abaferas.moneyeye.data.models.local.LocalTransaction
import com.abaferas.moneyeye.data.models.local.LocalUser

@Database(
    entities =
    [
        LocalAccount::class,
        LocalCategory::class,
        LocalCategories::class,
        LocalTransaction::class,
        LocalUser::class,
    ],
    version = 1
)
abstract class RoomLocalDatabase: RoomDatabase() {
    abstract fun accountDao(): LocalAccountDao
    abstract fun categoryDao(): LocalCategoryDao
    abstract fun categoriesDao(): LocalCategoriesDao
    abstract fun transactionDao(): LocalTransactionDao
    abstract fun userDao(): LocalUserDao
}