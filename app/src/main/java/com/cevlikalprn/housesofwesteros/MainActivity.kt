package com.cevlikalprn.housesofwesteros

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cevlikalprn.housesofwesteros.ui.theme.HousesOfWesterosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HousesOfWesterosTheme {
                HouseListScreen()
            }
        }
    }
}

@Composable
fun HouseListScreen() {
    Scaffold(
        topBar = { AppBar(title = "Houeses of Westeros", icon = Icons.Default.Home)}
    ) {

    }
}

@Composable
fun AppBar(title: String, icon: ImageVector) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = { Icon(
            imageVector = icon,
            contentDescription = "Home",
            modifier = Modifier.padding(horizontal = 8.dp)
        )}
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HousesOfWesterosTheme {
        HouseListScreen()
    }
}