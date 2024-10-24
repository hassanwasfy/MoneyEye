package com.abaferas.moneyeye.ui.screen.home

interface HomeInteraction {
    fun onItemChange(newText: String)
    fun onAmountChanged(newText: String)
    fun onPriceChanged(newText: String)
    fun onExpandStateChanged(newState: Boolean)
    fun onSelectCategory(item: CategoryItem)
    fun onSelectPayment(item: CategoryItem)
}