package com.example.kotlinlogin
import androidx.compose.ui.geometry.Rect

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.LayoutDirection
import kotlin.math.min

class NotchedCardShape(private val radius: Dp) : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val rPx = with(density) { radius.toPx() }
        val path = Path().apply {
            reset()

            // Top-left to top-right
            moveTo(0f, 0f)
            lineTo(size.width, 0f)

            // Top-right to bottom-right
            lineTo(size.width, size.height - rPx)

            // Bottom-right circle cut-out
            arcTo(
                rect = Rect(
                    left = size.width - 2 * rPx,
                    top = size.height - 2 * rPx,
                    right = size.width,
                    bottom = size.height
                ),
                startAngleDegrees = 0f,
                sweepAngleDegrees = -180f,
                forceMoveTo = false
            )


            // Bottom line to left circle
            lineTo(rPx, size.height)

            // Bottom-left circle cut-out
            arcTo(
                rect = Rect(
                    left = 0f,
                    top = size.height - 2 * rPx,
                    right = 2 * rPx,
                    bottom = size.height
                ),
                startAngleDegrees = 180f,
                sweepAngleDegrees = -180f,
                forceMoveTo = false
            )

            // Back to top-left
            lineTo(0f, 0f)
            close()
        }

        return Outline.Generic(path)
    }
}

@Composable
fun FlightCard(modifier: Modifier = Modifier) {
    val circleRadius = 12.dp
    Card(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = NotchedCardShape(circleRadius),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(Modifier.padding(16.dp)) {
            Text("CGK ➝ DPS", style = MaterialTheme.typography.titleMedium)
            Text("Sentosa Air • Economy • Direct")
            Text("24 March 2024 • 05:30 - 06:30")
            Spacer(Modifier.height(8.dp))
            Text("Booking ID: ZEEBAW", style = MaterialTheme.typography.labelSmall)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FlightCardPreview() {
    MaterialTheme {
        FlightCard()
    }
}