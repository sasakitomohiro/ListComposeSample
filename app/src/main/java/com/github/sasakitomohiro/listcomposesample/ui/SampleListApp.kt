package com.github.sasakitomohiro.listcomposesample.ui

import androidx.compose.foundation.ExperimentalFoundationApi
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
        when (currentScreenType) {
            ScreenType.VERTICAL -> SampleVerticalList()
            ScreenType.HORIZONTAL -> SampleHorizontalList()
            ScreenType.GRID -> SampleGridList()
        }
    }
}
