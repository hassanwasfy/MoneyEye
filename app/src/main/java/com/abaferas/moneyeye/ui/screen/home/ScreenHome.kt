package com.abaferas.moneyeye.ui.screen.home

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuBoxScope
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun ScreenHome(viewModel: HomeViewModel = hiltViewModel()) {
    val state = viewModel.state.collectAsState()
    ScreenHomeContent(state.value, viewModel)
}


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ScreenHomeContent(state: HomeUiState, interaction: HomeInteraction) {
    Scaffold { _ ->
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            item {
                TextField(state.itemName, placeholder = {
                    Text("Item")
                }, modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        horizontal = 16.dp, vertical = 8.dp
                    ), onValueChange = { newText ->
                    interaction.onItemChange(newText)
                })
            }

            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    items(state.categories, key = { it.id }) { item ->
                        Box(
                            modifier = Modifier
                                .background(
                                    if (state.category.id == item.id) {
                                        Color.Green
                                    } else {
                                        Color.Red
                                    }
                                )
                                .clickable {
                                    interaction.onSelectCategory(item)
                                }
                                .padding(horizontal = 16.dp)
                                .clip(RoundedCornerShape(CornerSize(16.dp))),
                        ) {
                            Text(item.name)
                        }
                    }
                }
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(
                            horizontal = 16.dp, vertical = 8.dp
                        ),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextField(state.itemAmount, placeholder = {
                        Text("amount")
                    }, modifier = Modifier.fillParentMaxWidth(0.3f), onValueChange = { newText ->
                        interaction.onAmountChanged(newText)
                    })
                    TextField(state.itemPrice, placeholder = {
                        Text("price")
                    }, modifier = Modifier.fillParentMaxWidth(0.3f), onValueChange = { newText ->
                        interaction.onPriceChanged(newText)
                    })
                    Box(
                        contentAlignment = Alignment.BottomCenter,
                        modifier = Modifier
                            .fillParentMaxWidth(0.3f)
                            .background(Color.Cyan)
                            .fillMaxHeight()
                    ) {
                        Text(
                            text = state.itemTotal,
                            modifier = Modifier.fillMaxHeight(),
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }

            item {
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    items(state.payments, key = { it.id }) { item ->
                        Box(
                            modifier = Modifier
                                .background(
                                    if (state.payment.id == item.id) {
                                        Color.Green
                                    } else {
                                        Color.Red
                                    }
                                )
                                .clickable {
                                    interaction.onSelectPayment(item)
                                }
                                .padding(horizontal = 16.dp)
                                .clip(RoundedCornerShape(CornerSize(16.dp))),
                        ) {
                            Text(item.name)
                        }
                    }
                }
            }

        }
    }
}


@Preview(
    name = "home", device = "id:pixel_7_pro", showSystemUi = true, showBackground = true
)
@Composable
fun ScreenHomePreview() {
    ScreenHome()
}