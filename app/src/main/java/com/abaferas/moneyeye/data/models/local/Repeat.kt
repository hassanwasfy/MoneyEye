package com.abaferas.moneyeye.data.models.local

import com.abaferas.moneyeye.data.util.DataConstants


enum class Repeat(val value: String) {
    ONE_TIME(DataConstants.REPEAT_ONE_TIME),
    WEEKLY(DataConstants.REPEAT_WEEKLY),
    MONTHLY(DataConstants.REPEAT_MONTHLY),
    YEARLY(DataConstants.REPEAT_YEARLY),
    THREE_MONTH(DataConstants.REPEAT_THREE_MONTH),
    FOUR_MONTH(DataConstants.REPEAT_FOUR_MONTH),
    SIX_MONTH(DataConstants.REPEAT_SIX_MONTH),
}