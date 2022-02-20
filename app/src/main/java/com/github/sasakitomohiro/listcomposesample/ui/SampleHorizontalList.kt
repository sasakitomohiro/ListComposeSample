package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.sasakitomohiro.listcomposesample.MainViewModel
import com.github.sasakitomohiro.listcomposesample.ScreenType

@Composable
fun SampleHorizontalList() {
    val viewModel: MainViewModel = viewModel()
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
