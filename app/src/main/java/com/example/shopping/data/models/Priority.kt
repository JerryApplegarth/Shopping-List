package com.example.shopping.data.models

import androidx.compose.ui.graphics.Color
import com.example.shopping.ui.theme.HighPriorityColor
import com.example.shopping.ui.theme.LowPriorityColor
import com.example.shopping.ui.theme.MediumPriorityColor
import com.example.shopping.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)

}