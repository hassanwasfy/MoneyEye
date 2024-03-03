package com.abaferas.moneyeye.data.util

import kotlin.random.Random

const val START = 20000101.0
const val END = 30001231.0

fun generateId(): Double {
    return Random.nextDouble(START, END)
}