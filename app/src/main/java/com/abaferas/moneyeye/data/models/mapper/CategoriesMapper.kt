package com.abaferas.moneyeye.data.models.mapper

import com.abaferas.moneyeye.data.models.local.LocalCategories
import com.abaferas.moneyeye.domain.entity.Categories

fun LocalCategories.toDomainModel(): Categories {
    return Categories(
        id = this.id,
        categoryId = this.categoryId,
        transactionId = this.transactionId
    )
}

fun Categories.toDtoModel(): LocalCategories {
    return LocalCategories(
        id = this.id,
        categoryId = this.categoryId,
        transactionId = this.transactionId
    )
}

fun List<LocalCategories>.toDomainModel(): List<Categories> = this.map { it.toDomainModel() }

fun List<Categories>.toDtoModel(): List<LocalCategories> = this.map { it.toDtoModel() }