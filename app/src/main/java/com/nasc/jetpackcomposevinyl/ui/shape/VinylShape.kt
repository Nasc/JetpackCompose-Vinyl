package com.nasc.jetpackcomposevinyl.ui.shape

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathOperation
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

/**
 * Simple Vinyl/Donut shape (o)
 */
class VinylShape : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val p1 = Path().apply {
            addOval(Rect(0f, 0f, size.width - 1, size.height - 1))
        }
        val thickness = size.height / 2.10f
        val p2 = Path().apply {
            addOval(
                Rect(
                    thickness,
                    thickness,
                    size.width - 1 - thickness,
                    size.height - 1 - thickness
                )
            )
        }
        val p3 = Path()
        p3.op(p1, p2, PathOperation.difference)
        return Outline.Generic(p3)
    }
}