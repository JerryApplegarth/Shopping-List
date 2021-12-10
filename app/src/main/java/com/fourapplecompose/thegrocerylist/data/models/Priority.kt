package com.fourapplecompose.thegrocerylist.data.models

import androidx.compose.ui.graphics.Color
import com.fourapplecompose.thegrocerylist.ui.theme.HighPriorityColor
import com.fourapplecompose.thegrocerylist.ui.theme.LowPriorityColor
import com.fourapplecompose.thegrocerylist.ui.theme.MediumPriorityColor
import com.fourapplecompose.thegrocerylist.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)

}