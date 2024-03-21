package com.abaferas.moneyeye.domain.usecase.user

import com.abaferas.moneyeye.domain.entity.User
import com.abaferas.moneyeye.domain.source.repository.Repository
import javax.inject.Inject

class UserUseCaseImpl @Inject constructor(
    private val repository: Repository
) : UserUseCase {

    override suspend fun insertUser(user: User) {
        repository.insertUser(user)
    }

    override suspend fun updateUser(user: User) {
        repository.updateUser(user)
    }

    override suspend fun deleteUser(user: User) {
        repository.deleteUser(user)
    }

    override suspend fun setLoginState(state: Boolean) {
        repository.setLoginState(state)
    }

    override suspend fun getLoginState(): Boolean {
        return repository.getLoginState()
    }
}