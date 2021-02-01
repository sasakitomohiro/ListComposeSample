package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.github.sasakitomohiro.listcomposesample.MainViewModel
import com.github.sasakitomohiro.listcomposesample.ScreenType

@ExperimentalFoundationApi
@Composable
fun SampleGridList(
    viewModel: MainViewModel
) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
    ) {
        itemsIndexed(ScreenType.values()) { _, item ->
            SampleGridListItem(
                screenType = item,
                viewModel = viewModel
            )
        }
    }
}

@Composable
fun SampleGridListItem(
    screenType: ScreenType,
    viewModel: MainViewModel
) {
    Card(
        elevation = 8.dp,
        modifier = Modifier
            .padding(10.dp)
            .clickable(
                onClick = {
                    if (screenType == ScreenType.GRID) return@clickable
                    viewModel.navigate(screenType)
                }
            )
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {
            Text("${screenType.name} title")
            Text("${screenType.name} content")
        }
    }
}
