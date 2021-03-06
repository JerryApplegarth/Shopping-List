package com.fourapplecompose.thegrocerylist.ui.theme.screens.task

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fourapplecompose.thegrocerylist.components.PriorityDropdown
import com.fourapplecompose.thegrocerylist.data.models.Priority
import com.fourapplecompose.thegrocerylist.ui.theme.LARGE_PADDING
import com.fourapplecompose.thegrocerylist.ui.theme.MEDIUM_PADDING
import com.fourapplecompose.thegrocerylist.R

@Composable
fun TaskContent(
    title: String,
    onTitleChange: (String) -> Unit,
    description: String,
    onDescriptionChange: (String) -> Unit,
    priority: Priority,
    onPrioritySelected: (Priority) -> Unit

) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                MaterialTheme
                    .colors.background
            )
            .padding(all = LARGE_PADDING)

    ) {
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),

            value = title,
            onValueChange = { onTitleChange(it) },
            label = {
                Text(
                    text = stringResource(
                        id = R.string.title
                    )
                )
            },
            textStyle = MaterialTheme.typography.body1,
            singleLine = true
        )
        Divider(
            modifier = Modifier
                .height(MEDIUM_PADDING),
            color = MaterialTheme
                .colors.background
        )
        PriorityDropdown(
            priority = priority,
            onPrioritySelected = onPrioritySelected
        )


        OutlinedTextField(
            modifier = Modifier
                .height(200.dp)
                .verticalScroll(rememberScrollState()),

            value = description,
            onValueChange = { onDescriptionChange(it) },
            label = {
                Text(
                    text = stringResource(
                        id = R.string.description,

                        )
                )
            },
            textStyle = MaterialTheme.typography.body1
            )

    }

}

@Preview
@Composable
fun TaskContentPreview() {
    TaskContent(
        title = "",
        onTitleChange = {},
        description = "",
        onDescriptionChange = {},
        priority = Priority.LOW,
        onPrioritySelected = {}
    )
}