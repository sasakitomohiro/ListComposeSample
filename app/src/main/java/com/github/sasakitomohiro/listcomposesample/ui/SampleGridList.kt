package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.sasakitomohiro.listcomposesample.MainViewModel
import com.github.sasakitomohiro.listcomposesample.ScreenType

@ExperimentalFoundationApi
@Composable
fun SampleGridList() {
    val viewModel: MainViewModel = viewModel()
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
