package com.github.sasakitomohiro.listcomposesample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.ui.platform.setContent
import com.github.sasakitomohiro.listcomposesample.ui.SampleListApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { SampleListApp() }
    }
}
