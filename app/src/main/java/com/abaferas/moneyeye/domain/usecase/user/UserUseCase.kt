package com.abaferas.moneyeye.domain.usecase.user

import com.abaferas.moneyeye.domain.entity.User

interface UserUseCase {
    suspend fun insertUser(user: User)
    suspend fun updateUser(user: User)
    suspend fun deleteUser(user: User)
    suspend fun setLoginState(state: Boolean)
    suspend fun getLoginState(): Boolean

}