package com.github.sasakitomohiro.listcomposesample

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import com.github.sasakitomohiro.listcomposesample.ui.SampleListApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { SampleListApp(viewModel) }

        observeState()
    }

    private fun observeState() {
        viewModel.currentScreenType.observe(this) {

        }
    }
}
