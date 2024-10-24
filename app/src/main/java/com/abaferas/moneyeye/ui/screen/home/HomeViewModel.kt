package com.abaferas.moneyeye.ui.screen.home

import com.abaferas.moneyeye.ui.base.BaseViewModel
import kotlinx.coroutines.flow.update

class HomeViewModel : BaseViewModel<HomeUiState, HomeEffect>(HomeUiState()), HomeInteraction {


    override fun onItemChange(newText: String) {
        iState.update {
            it.copy(itemName = newText)
        }
    }

    override fun onAmountChanged(newText: String) {
        iState.update {
            it.copy(itemAmount = newText)
        }
        prepareTotal(state.value.itemAmount, state.value.itemPrice)
    }

    override fun onPriceChanged(newText: String) {
        iState.update {
            it.copy(itemPrice = newText)
        }
        prepareTotal(state.value.itemAmount, state.value.itemPrice)
    }

    override fun onExpandStateChanged(newState: Boolean) {
        iState.update {
            it.copy(isExpanded = newState)
        }
    }

    override fun onSelectCategory(item: CategoryItem) {
        iState.update {
            it.copy(category = item)
        }
    }

    override fun onSelectPayment(item: CategoryItem) {
        iState.update {
            it.copy(payment = item)
        }
    }


    private fun prepareTotal(amount: String, price: String) {
        if (amount.isNotBlank() && amount.isNotEmpty() &&
            price.isNotBlank() && price.isNotEmpty()
        ) {
            val a = amount.toDouble()
            val p = price.toDouble()
            val result = a * p
            iState.update {
                it.copy(itemTotal = "$result")
            }
        }

    }


}