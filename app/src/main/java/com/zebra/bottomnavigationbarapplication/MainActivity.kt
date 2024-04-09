package com.zebra.bottomnavigationbarapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.zebra.bottomnavigationbarapplication.ui.theme.BottomNavigationBarApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationBarApplicationTheme {
                Greeting(name = "Android")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                items = listOf(
                    BottomNavItem(
                        name = "Home",
                        route = Screen.HomeScreen.route,
                        icon = Icons.Default.Home
                    ),
                    BottomNavItem(
                        name = "Chat",
                        route = Screen.ChatScreen.route,
                        icon = Icons.Default.Notifications,
                        badgeCount = 25
                    ),
                    BottomNavItem(
                        name = "Settings",
                        route = Screen.SettingScreen.route,
                        icon = Icons.Default.Settings,
                        badgeCount = 214
                    ),
                ),
                navController = navController,
                onItemClick = {
                    navController.navigate(it.route)
                }
            )
        }
    ) {
        Navigation(navController = navController)
        Log.d("TAGG", "$name $it")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BottomNavigationBarApplicationTheme {
        Greeting("Android")
    }
}