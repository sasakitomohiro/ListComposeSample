package com.github.sasakitomohiro.listcomposesample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.setContent
import com.github.sasakitomohiro.listcomposesample.ui.SampleList
import com.github.sasakitomohiro.listcomposesample.ui.theme.ListComposeSampleTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ListComposeSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    SampleList(
                        items = (0..10).map {
                            Pair("$it title", "$it content")
                        }
                    )
                }
            }
        }
    }
}
