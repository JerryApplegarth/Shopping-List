package com.fourapplecompose.shopping.data.models

import androidx.compose.ui.graphics.Color
import com.fourapplecompose.shopping.ui.theme.HighPriorityColor
import com.fourapplecompose.shopping.ui.theme.LowPriorityColor
import com.fourapplecompose.shopping.ui.theme.MediumPriorityColor
import com.fourapplecompose.shopping.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)

}