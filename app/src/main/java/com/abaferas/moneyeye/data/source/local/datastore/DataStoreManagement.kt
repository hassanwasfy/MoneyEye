package com.abaferas.moneyeye.data.source.local.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.abaferas.moneyeye.domain.utils.Constants
import kotlinx.coroutines.flow.lastOrNull
import kotlinx.coroutines.flow.map
import javax.inject.Inject


val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = Constants.DATASTORE_NAME)

class DataStoreManagement @Inject constructor(
    private val context: Context
) {
    private val loginStatus = booleanPreferencesKey(Constants.LOGIN_KEY)

    suspend fun setLoginStatus(status: Boolean) {
        context.dataStore.edit { settings ->
            settings[loginStatus] = status
        }
    }

    suspend fun getLoginStatus(): Boolean {
        return context.dataStore.data.map { preferences ->
            preferences[loginStatus] ?: false
        }.lastOrNull() ?: false
    }
}