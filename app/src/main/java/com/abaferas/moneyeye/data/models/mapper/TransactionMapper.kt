package com.abaferas.moneyeye.data.models.mapper

import com.abaferas.moneyeye.data.models.local.LocalTransaction
import com.abaferas.moneyeye.domain.entity.Transaction

fun LocalTransaction.toDomainModel(): Transaction {
    return Transaction(
        id = this.id,
        accountId = this.accountId,
        name = this.name,
        amount = this.amount,
        type = this.type,
        repeat = this.repeat,
        synced = this.synced,
        date = this.date,
        dueDate = this.dueDate,
        note = this.note,
        quantity = this.quantity,
        total = this.total
    )
}

fun Transaction.toDtoModel(): LocalTransaction {
    return LocalTransaction(
        id = this.id,
        accountId = this.accountId,
        name = this.name,
        amount = this.amount,
        type = this.type,
        repeat = this.repeat,
        synced = this.synced,
        date = this.date,
        dueDate = this.dueDate,
        note = this.note,
        quantity = this.quantity,
        total = this.total
    )
}

fun List<LocalTransaction>.toDomainModel() = this.map { it.toDomainModel() }
fun List<Transaction>.toDtoModel() = this.map { it.toDtoModel() }