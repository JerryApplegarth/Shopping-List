package com.fourapplecompose.thegrocerylist.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.fourapplecompose.thegrocerylist.navigation.destinations.listComposable
import com.fourapplecompose.thegrocerylist.navigation.destinations.splashComposable
import com.fourapplecompose.thegrocerylist.navigation.destinations.taskComposable
import com.fourapplecompose.thegrocerylist.ui.theme.viewmodels.SharedViewModel
import com.fourapplecompose.thegrocerylist.util.Constants.SPLASH_SCREEN

@ExperimentalAnimationApi
@ExperimentalMaterialApi
@Composable
fun SetupNavigation(
    navController: NavController,
    sharedViewModel: SharedViewModel
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController as NavHostController,
        startDestination = SPLASH_SCREEN
    ) {
        splashComposable(
            navigateToListScreen = screen.splash
        )
        listComposable(
            navigateToTaskScreen = screen.list,
            sharedViewModel = sharedViewModel
        )
        taskComposable(
            navigateToListScreen = screen.task,
            sharedViewModel = sharedViewModel
        )

    }


}