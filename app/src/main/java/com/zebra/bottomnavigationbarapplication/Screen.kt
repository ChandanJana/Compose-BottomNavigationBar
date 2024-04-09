package com.zebra.bottomnavigationbarapplication

/**
 * Created by Chandan Jana on 02-08-2023.
 * Company name: Mindteck
 * Email: chandan.jana@mindteck.com
 */
sealed class Screen (val route: String){
    object HomeScreen : Screen("home_screen")
    object ChatScreen : Screen("chat_screen")
    object SettingScreen : Screen("setting_screen")
}