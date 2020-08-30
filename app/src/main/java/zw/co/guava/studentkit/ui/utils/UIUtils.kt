package zw.co.guava.studentkit.ui.utils

import androidx.compose.ui.graphics.Color
import kotlin.random.Random

fun randomColor(): Color = Color(
        red  = Random.nextInt(0, 255),
        blue = Random.nextInt(0, 255),
        green = Random.nextInt(0, 255)
)

fun randomDarkBackground(): Color = Color(
        red  = Random.nextInt(0, 255),
        blue = Random.nextInt(0, 255),
        green = Random.nextInt(0, 255)
)