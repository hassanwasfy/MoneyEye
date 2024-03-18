package com.abaferas.moneyeye.domain.entity

import com.abaferas.moneyeye.data.util.Constants


enum class Type(val value: String) {
    PAYMENT(Constants.TYPE_PAYMENT),
    INCOME(Constants.TYPE_INCOME),
}