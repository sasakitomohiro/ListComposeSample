package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SampleList(
    items: List<Pair<String, String>>
) {
    LazyColumnFor(
        items = items,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
    ) {
        SampleListItem(
            title = it.first,
            content = it.second
        )
        Divider()
    }
}

@Composable
fun SampleListItem(
    title: String,
    content: String
) {
    Column(
        modifier = Modifier
            .clickable(onClick = {})
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Text(title)
        Text(content)
    }
}
