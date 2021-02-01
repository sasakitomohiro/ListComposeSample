package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.github.sasakitomohiro.listcomposesample.MainViewModel
import com.github.sasakitomohiro.listcomposesample.ScreenType

@Composable
fun SampleHorizontalList(
    viewModel: MainViewModel
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
    ) {
        itemsIndexed(ScreenType.values()) { _, item ->
            SampleHorizontalListItem(
                screenType = item,
                viewModel = viewModel
            )
            Divider()
        }
    }
}

@Composable
fun SampleHorizontalListItem(
    screenType: ScreenType,
    viewModel: MainViewModel
) {
    Card(
        elevation = 8.dp,
        modifier = Modifier
            .padding(10.dp)
            .clickable(
                onClick = {
                    if (screenType == ScreenType.HORIZONTAL) return@clickable
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
