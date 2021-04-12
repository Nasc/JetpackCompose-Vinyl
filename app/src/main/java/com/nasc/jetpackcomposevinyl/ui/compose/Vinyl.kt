package com.nasc.jetpackcomposevinyl.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.nasc.jetpackcomposevinyl.R
import com.nasc.jetpackcomposevinyl.ui.shape.VinylShape

@Composable
fun Vinyl(
    modifier: Modifier = Modifier,
    rotationDegrees: Float = 0f
) {
    Box(
        modifier = modifier
            .aspectRatio(1.0f)
            .clip(VinylShape())
    ) {

        // Vinyl background
        Image(
            modifier = Modifier
                .fillMaxSize()
                .rotate(rotationDegrees),
            painter = painterResource(id = R.drawable.vinyl_background),
            contentDescription = ""
        )

        // Vinyl lights effect
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.vinyl_light),
            contentDescription = "",
        )

        // Vinyl 'album' cover
        // For using with Coil or Glide, wrap into surface with shape 
        Image(
            modifier = Modifier
                .fillMaxSize(0.3f)
                .align(Alignment.Center)
                .rotate(rotationDegrees)
                .aspectRatio(1.0f)
                .clip(CircleShape),
            painter = painterResource(R.drawable.album_cover),
            contentDescription = stringResource(id = R.string.album_cover)
        )
    }
}

