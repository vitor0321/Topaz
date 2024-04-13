package com.walcker.topaz.components.loading

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.walcker.topaz.ExperimentalTopazComposeLibraryApi
import com.walcker.topaz.tokens.CircularStroke

@ExperimentalTopazComposeLibraryApi
@Composable
public fun TopazCircularProgress(
    modifier: Modifier = Modifier,
    stroke: CircularStroke = CircularStroke.Medium,
) {
    CircularProgress(
        modifier = modifier,
        stroke = stroke,
    )
}

@Composable
private fun CircularProgress(
    modifier: Modifier = Modifier,
    stroke: CircularStroke
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        CircularProgressIndicator(
            modifier = modifier.width(45.dp),
            color = MaterialTheme.colorScheme.surfaceVariant,
            strokeWidth = stroke.width,
            trackColor = MaterialTheme.colorScheme.secondary
        )
    }
}