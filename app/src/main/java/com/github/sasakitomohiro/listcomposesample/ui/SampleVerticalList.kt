package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.github.sasakitomohiro.listcomposesample.MainViewModel
import com.github.sasakitomohiro.listcomposesample.ScreenType

@Composable
fun SampleVerticalList(
    viewModel: MainViewModel
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
    ) {
        itemsIndexed(ScreenType.values()) { _, item ->
            SampleVerticalListItem(
                screenType = item,
                viewModel = viewModel
            )
            Divider()
        }
    }
}

@Composable
fun SampleVerticalListItem(
    screenType: ScreenType,
    viewModel: MainViewModel
) {
    Column(
        modifier = Modifier
            .clickable(
                onClick = {
                    if (screenType == ScreenType.VERTICAL) return@clickable
                    viewModel.navigate(screenType)
                }
            )
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Text("${screenType.name} title")
        Text("${screenType.name} content")
    }
}
