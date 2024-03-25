package com.abaferas.moneyeye.data.models.mapper

import com.abaferas.moneyeye.data.models.local.LocalLogin
import com.abaferas.moneyeye.domain.entity.Login


fun LocalLogin.toDomainModel(): Login {
    return Login(
        id = this.id,
        email = this.email,
        password = this.password,
    )
}

fun Login.toDtoModel(): LocalLogin {
    return LocalLogin(
        id = this.id,
        email = this.email,
        password = this.password,
    )
}

fun List<LocalLogin>.toDomainModel(): List<Login> {
    return this.map { it.toDomainModel() }
}

fun List<Login>.toDtoModel(): List<LocalLogin> {
    return this.map { it.toDtoModel() }
}