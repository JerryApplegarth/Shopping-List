package com.fourapplecompose.thegrocerylist.ui.theme.splash

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fourapplecompose.thegrocerylist.ui.theme.splashScreenBackground
import kotlinx.coroutines.delay
import com.fourapplecompose.thegrocerylist.R


@Composable
fun SplashScreen(
    navigateToListScreen: () -> Unit
) {

    var startAnimation by remember {
        mutableStateOf(false)

    }

    val offsetState by animateDpAsState(
        targetValue = if (startAnimation) 0.dp else 300.dp,
        animationSpec = tween(
            durationMillis = 1000
        )
    )

    val alphaState by animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = tween(
            durationMillis = 1000
        )
    )



    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(4000)
        navigateToListScreen()


    }

    Column(
        modifier = Modifier
            .fillMaxSize()

            .background(MaterialTheme.colors.splashScreenBackground),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = stringResource(R.string.app_produced)
        )
        Text(
            text = stringResource(R.string.applegarth_apps),
            fontWeight = FontWeight.Bold,

        )
        Image(painter = painterResource(
            id = R.drawable.four_apple_small),
            contentDescription = stringResource(R.string.apple_icon),
            Modifier.size(30.dp)
        )

    }

}



@Preview(showSystemUi = true)
@Composable
private fun SplashScreenPreview() {
    SplashScreen(
        navigateToListScreen = {}
    )
}

