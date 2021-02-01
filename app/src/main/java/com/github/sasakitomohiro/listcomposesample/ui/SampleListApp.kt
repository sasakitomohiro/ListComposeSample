package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import com.github.sasakitomohiro.listcomposesample.MainViewModel
import com.github.sasakitomohiro.listcomposesample.ScreenType
import com.github.sasakitomohiro.listcomposesample.ui.theme.ListComposeSampleTheme

@Composable
fun SampleListApp(
    viewModel: MainViewModel
) {
    val currentScreenType = viewModel.currentScreenType.observeAsState(ScreenType.VERTICAL).value
    ListComposeSampleTheme {
        Crossfade(current = currentScreenType) { screenType ->
            Surface(color = MaterialTheme.colors.background) {
                when (screenType) {
                    ScreenType.VERTICAL -> SampleVerticalList(viewModel)
                    ScreenType.HORIZONTAL -> Text(text = "horizontal")
                    ScreenType.GRID -> Text(text = "grid")
                }
            }
        }
        
    }
}
