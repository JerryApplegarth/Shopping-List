package com.fourapplecompose.thegrocerylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.fourapplecompose.thegrocerylist.navigation.SetupNavigation
import com.fourapplecompose.thegrocerylist.ui.theme.ShoppingTheme
import com.fourapplecompose.thegrocerylist.ui.theme.viewmodels.SharedViewModel
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalAnimationApi
@ExperimentalMaterialApi
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController
    private val sharedViewModel: SharedViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShoppingTheme {
                navController = rememberNavController()
                SetupNavigation(
                    navController = navController,
                    sharedViewModel = sharedViewModel
                )

            }
        }
    }
}

