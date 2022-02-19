package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import com.github.sasakitomohiro.listcomposesample.MainViewModel
import com.github.sasakitomohiro.listcomposesample.ScreenType
import com.github.sasakitomohiro.listcomposesample.ui.theme.ListComposeSampleTheme

@ExperimentalFoundationApi
@Composable
fun SampleListApp(
    viewModel: MainViewModel
) {
    val currentScreenType = viewModel.currentScreenType.observeAsState(ScreenType.VERTICAL).value
    ListComposeSampleTheme {
        Crossfade(targetState = currentScreenType) { screenType ->
            Surface(color = MaterialTheme.colors.background) {
                when (screenType) {
                    ScreenType.VERTICAL -> SampleVerticalList(viewModel)
                    ScreenType.HORIZONTAL -> SampleHorizontalList(viewModel)
                    ScreenType.GRID -> SampleGridList(viewModel)
                }
            }
        }
        
    }
}
