package com.abaferas.moneyeye.data.models.mapper

import com.abaferas.moneyeye.data.models.local.LocalUser
import com.abaferas.moneyeye.domain.entity.User


fun LocalUser.toDomainModel(): User {
    return User(
        id = this.id,
        firstName = this.firstName,
        lastName = this.lastName,
        email = this.email,
        password = this.password,
        synced = this.synced,
    )
}

fun User.toDtoModel(): LocalUser {
    return LocalUser(
        id = this.id,
        firstName = this.firstName,
        lastName = this.lastName,
        email = this.email,
        password = this.password,
        synced = this.synced,
    )
}

fun List<LocalUser>.toDomainModel(): List<User> {
    return this.map { it.toDomainModel() }
}

fun List<User>.toDtoModel(): List<LocalUser> {
    return this.map { it.toDtoModel() }
}