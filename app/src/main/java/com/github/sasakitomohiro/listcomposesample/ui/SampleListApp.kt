package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.github.sasakitomohiro.listcomposesample.MainViewModel
import com.github.sasakitomohiro.listcomposesample.ScreenType
import com.github.sasakitomohiro.listcomposesample.ui.theme.ListComposeSampleTheme

@Composable
fun SampleListApp(
    navigate: (ScreenType) -> Unit
) {
    ListComposeSampleTheme {
        Surface(color = MaterialTheme.colors.background) {
            SampleList(navigate)
        }
    }
}
