package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.github.sasakitomohiro.listcomposesample.ui.theme.ListComposeSampleTheme

@Composable
fun SampleListApp() {
    ListComposeSampleTheme {
        Surface(color = MaterialTheme.colors.background) {
            SampleList(
                items = (0..10).map {
                    Pair("$it title", "$it content")
                }
            )
        }
    }
}
