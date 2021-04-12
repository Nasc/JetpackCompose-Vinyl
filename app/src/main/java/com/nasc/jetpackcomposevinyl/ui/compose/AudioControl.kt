package com.nasc.jetpackcomposevinyl.ui.compose

import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.nasc.jetpackcomposevinyl.R

@Composable
fun AudioControl(
    modifier: Modifier = Modifier,
    isPlaying: Boolean = false,
    tint: Color = MaterialTheme.colors.onPrimary,
    clickTogglePlayPause: (() -> Unit)
) {
    Icon(
        imageVector = if (isPlaying) Icons.Filled.Pause else Icons.Filled.PlayArrow,
        contentDescription = stringResource(id = R.string.toggle_play_pause_button),
        tint = tint,
        modifier = modifier
            .clip(CircleShape)
            .clickable(onClick = clickTogglePlayPause)
    )
}