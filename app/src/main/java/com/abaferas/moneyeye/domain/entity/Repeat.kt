package com.abaferas.moneyeye.domain.entity

import com.abaferas.moneyeye.data.util.Constants


enum class Repeat(val value: String) {
    ONE_TIME(Constants.REPEAT_ONE_TIME),
    WEEKLY(Constants.REPEAT_WEEKLY),
    MONTHLY(Constants.REPEAT_MONTHLY),
    YEARLY(Constants.REPEAT_YEARLY),
    THREE_MONTH(Constants.REPEAT_THREE_MONTH),
    FOUR_MONTH(Constants.REPEAT_FOUR_MONTH),
    SIX_MONTH(Constants.REPEAT_SIX_MONTH),
}