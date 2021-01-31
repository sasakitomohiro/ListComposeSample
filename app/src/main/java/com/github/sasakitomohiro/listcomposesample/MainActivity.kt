package com.github.sasakitomohiro.listcomposesample

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import com.github.sasakitomohiro.listcomposesample.ui.SampleListApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { SampleListApp(viewModel::navigate) }

        observeState()
    }

    private fun observeState() {
        viewModel.navigateState.observe(this) {

        }
    }
}
