package com.fourapplecompose.thegrocerylist.ui.theme.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fourapplecompose.thegrocerylist.R
import com.fourapplecompose.thegrocerylist.ui.theme.mediumGreen
import com.fourapplecompose.thegrocerylist.ui.theme.splashScreenBackground
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(
    navigateToListScreen: () -> Unit
) {
    LaunchedEffect(key1 = true) {
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
        AppLogo()


    }
}

@Composable
fun AppLogo() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Image(
            painter = painterResource(
                id = R.drawable.four_apple_small
            ),
            contentDescription = "An Apple for a logo",
            Modifier.size(30.dp)
        )
        Text(
            text = stringResource(R.string.applegarth_apps),
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.mediumGreen
        )

        val annotatedLinkString: AnnotatedString = buildAnnotatedString {

            val str = "Buy me a Coffee "
            val startIndex = str.indexOf("Coffee")
            val endIndex = startIndex + 6
            append(str)
            addStyle(
                style = SpanStyle(
                    color = Color(0xff64B5F6),
                    fontSize = 18.sp,

                    textDecoration = TextDecoration.Underline
                ), start = startIndex, end = endIndex
            )
            addStringAnnotation(
                tag = "URL",
                annotation = "https://www.buymeacoffee.com/JerryApplegarth",
                start = startIndex,
                end = endIndex
            )
        }

        val uriHandler = LocalUriHandler.current
        ClickableText(
            modifier = Modifier
                .padding(start = 124.dp, end = 8.dp)
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),

            text = annotatedLinkString,

            onClick = {
                annotatedLinkString
                    .getStringAnnotations("URL", it, it)
                    .firstOrNull()?.let { stringAnnotation ->
                        uriHandler.openUri(stringAnnotation.item)
                    }
            })
    }
}


@Preview(showSystemUi = true)
@Composable
private fun SplashScreenPreview() {
    SplashScreen(
        navigateToListScreen = {}
    )
}

