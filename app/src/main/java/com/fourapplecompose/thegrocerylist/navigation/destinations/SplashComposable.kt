package com.fourapplecompose.thegrocerylist.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.fourapplecompose.thegrocerylist.ui.theme.splash.SplashScreen
import com.fourapplecompose.thegrocerylist.util.Constants.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,

    ) {
    composable(
        route = SPLASH_SCREEN,

        ) {
        SplashScreen(navigateToListScreen = navigateToListScreen)

    }
}