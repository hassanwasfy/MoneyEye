package com.abaferas.moneyeye.domain.usecase.user

import com.abaferas.moneyeye.domain.entity.Login
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

    override suspend fun insertLogin(login: Login) {
        repository.insertLogin(login)
    }

    override suspend fun updateLogin(login: Login) {
        repository.updateLogin(login)
    }

    override suspend fun deleteLogin(login: Login) {
        repository.deleteLogin(login)
    }

    override suspend fun getLoginByEmail(email: String): Login {
        return repository.getLoginByEmail(email)
    }

    override suspend fun setLoginState(state: Boolean) {
        repository.setLoginState(state)
    }

    override suspend fun getLoginState(): Boolean {
        return repository.getLoginState()
    }
}