package com.abaferas.moneyeye.data.models.local

import com.abaferas.moneyeye.data.util.DataConstants


enum class Type(val value: String) {
    PAYMENT(DataConstants.TYPE_PAYMENT),
    INCOME(DataConstants.TYPE_INCOME),
}