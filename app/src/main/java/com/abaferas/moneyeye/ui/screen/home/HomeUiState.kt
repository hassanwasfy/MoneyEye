package com.abaferas.moneyeye.ui.screen.home

import com.abaferas.moneyeye.ui.base.BaseUiState

data class HomeUiState(
    val isLoading: Boolean = true,
    val hasError: Boolean = false,
    val isExpanded: Boolean = false,
    val errorMsg: String = "",
    val itemName: String = "",
    val itemAmount: String = "",
    val itemPrice: String = "",
    val itemTotal: String = "",
    val category: CategoryItem = CategoryItem(),
    val categories: List<CategoryItem> = emptyList(),
    val payment: CategoryItem = CategoryItem(),
    val payments: List<CategoryItem> = emptyList(),
    val date: String = "",
) : BaseUiState

data class CategoryItem(
    val id: Int = 0,
    val name: String = ""
)