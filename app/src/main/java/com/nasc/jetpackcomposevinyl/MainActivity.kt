package com.nasc.jetpackcomposevinyl

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.nasc.jetpackcomposevinyl.ui.compose.Main
import com.nasc.jetpackcomposevinyl.ui.compose.Vinyl
import com.nasc.jetpackcomposevinyl.ui.theme.JetpackComposeVinylTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeVinylTheme {
                Surface(color = MaterialTheme.colors.background) {
                    Main()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeVinylTheme {
        Vinyl()
    }
}