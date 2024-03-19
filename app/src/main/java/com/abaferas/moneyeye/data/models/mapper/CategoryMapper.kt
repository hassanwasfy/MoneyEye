package com.abaferas.moneyeye.data.models.mapper

import com.abaferas.moneyeye.data.models.local.LocalCategory
import com.abaferas.moneyeye.domain.entity.Category

fun LocalCategory.toDomainModel(): Category {
    return Category(
        id = this.id, name = this.name, synced = this.synced
    )
}

fun Category.toDtoModel(): LocalCategory {
    return LocalCategory(
        id = this.id, name = this.name, synced = this.synced
    )
}

fun List<LocalCategory>.toDomainModel(): List<Category> {
    return this.map { it.toDomainModel() }
}

fun List<Category>.toDtoModel(): List<LocalCategory> {
    return this.map { it.toDtoModel() }
}