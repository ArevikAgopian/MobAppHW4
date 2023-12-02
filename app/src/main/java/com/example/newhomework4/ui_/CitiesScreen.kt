package com.example.newhomework4.ui_


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.newhomework4.constants.WELCOME_SCREEN_ROUTE
import com.example.newhomework4.data.cities
import com.example.newhomework4.view.CityItem

@Composable
fun CityListScreen(navController: NavHostController) {
    LazyColumn {
        items(cities) { city ->
            CityItem(city, navController)
        }
    }

    IconButton(
        onClick = {
            navController.navigate(WELCOME_SCREEN_ROUTE)
        }
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Back to Welcome",
            tint = MaterialTheme.colorScheme.onSurface
        )
    }
}
