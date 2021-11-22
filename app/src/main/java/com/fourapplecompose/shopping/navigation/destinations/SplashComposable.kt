package com.fourapplecompose.shopping.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.fourapplecompose.shopping.ui.theme.splash.SplashScreen
import com.fourapplecompose.shopping.util.Constants.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,

    ) {
    composable(
        route = SPLASH_SCREEN,

        ) {
        SplashScreen(navigateToListScreen = navigateToListScreen)

    }
}