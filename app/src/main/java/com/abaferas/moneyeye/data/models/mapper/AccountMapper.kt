package com.abaferas.moneyeye.data.models.mapper

import com.abaferas.moneyeye.data.models.local.LocalAccount
import com.abaferas.moneyeye.domain.entity.Account


fun LocalAccount.toDomainModel(): Account {
    return Account(
        id = this.id,
        userId = this.userId,
        name = this.name,
        balance = this.balance,
        income = this.income,
        synced = this.synced
    )
}

fun Account.toDtoModel(): LocalAccount {
    return LocalAccount(
        id = this.id,
        userId = this.userId,
        name = this.name,
        balance = this.balance,
        income = this.income,
        synced = this.synced
    )
}

fun List<LocalAccount>.toDomainModel(): List<Account> = this.map { it.toDomainModel() }
fun List<Account>.toDtoModel(): List<LocalAccount> = this.map { it.toDtoModel() }