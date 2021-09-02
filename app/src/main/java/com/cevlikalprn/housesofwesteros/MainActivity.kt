package com.cevlikalprn.housesofwesteros

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.cevlikalprn.housesofwesteros.ui.theme.HousesOfWesterosTheme
import com.cevlikalprn.housesofwesteros.ui.theme.myBorderColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HousesOfWesterosTheme {
                HousesOfWesterosApplication()
            }
        }
    }
}

@Composable
fun HousesOfWesterosApplication(houses: List<HousesOfWesteros> = Constants.houseList) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "house_list_screen") {
        composable(route = "house_list_screen") { HouseListScreen(houses = houses,navController = navController) }
        composable(
            route = "house_details_screen/{houseId}",
            arguments = listOf(navArgument("houseId", builder = { type = NavType.IntType }))
        ) { backStackEntry ->
            HouseDetailsScreen(
                navController = navController,
                houseId = backStackEntry.arguments!!.getInt("houseId")
            )
        }
    }

}

@Composable
fun HouseListScreen(
    houses: List<HousesOfWesteros>,
    navController: NavController?
) {
    Scaffold(
        topBar = {
            AppBar(
                title = "Houses of Westeros",
                icon = Icons.Default.Home,
                clickAction = {}
            )
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
            LazyColumn {
                items(items = houses) { house ->
                    HouseCard(
                        house = house,
                        clickAction = {
                            navController?.navigate(route = "house_details_screen/${house.houseId}")
                        })
                }
            }
        }
    }
}

@Composable
fun HouseDetailsScreen(houseId: Int, navController: NavController?) {
    val house  = getHouse(houseId = houseId)
    Scaffold(
        topBar = {
            AppBar(
                title = "Houeses of Westeros",
                icon = Icons.Default.ArrowBack,
                clickAction = { navController?.navigateUp() }
            )
        }
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                HousePicture(
                    housePicture = house.housePicture,
                    imageSize = 240.dp
                )
                HouseContent(
                    houseName = house.houseName + " House",
                    words = house.houseWords,
                    horizontalAlignment = Alignment.CenterHorizontally
                )
                Spacer(modifier = Modifier.height(24.dp))
                HouseHistory(houseHistory = house.houseHistory)
            }
        }
    }
}

@Composable
fun AppBar(title: String, icon: ImageVector, clickAction: () -> Unit) {
    TopAppBar(
        title = { Text(text = title) },
        navigationIcon = {
            Icon(
                modifier = Modifier
                    .clickable(onClick = clickAction)
                    .padding(horizontal = 8.dp),
                imageVector = icon,
                contentDescription = "Home",
            )
        },
        backgroundColor = MaterialTheme.colors.background
    )
}

@Composable
fun HouseCard(house: HousesOfWesteros, clickAction: () -> Unit) {
    Card(
        modifier = Modifier
            .clickable(onClick = clickAction)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top)
            .padding(start = 18.dp, end = 18.dp, top = 12.dp, bottom = 12.dp),
        backgroundColor = Color.White
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            HousePicture(housePicture = house.housePicture, imageSize = 90.dp)
            HouseContent(
                houseName = house.houseName,
                words = house.houseWords,
                horizontalAlignment = Alignment.Start
            )
        }
    }
}

@Composable
fun HousePicture(housePicture: String, imageSize: Dp) {
    Surface(
        modifier = Modifier.padding(12.dp),
        shape = CircleShape,
        border = BorderStroke(width = 2.dp, color = MaterialTheme.colors.myBorderColor)
    ) {
        Image(
            painter = rememberImagePainter(
                data = housePicture,
                builder = { crossfade(true) }
            ),
            contentDescription = "house picture",
            modifier = Modifier.size(imageSize),
            contentScale = ContentScale.Fit
        )

    }
}

@Composable
fun HouseContent(houseName: String, words: String, horizontalAlignment: Alignment.Horizontal) {
    Column(horizontalAlignment = horizontalAlignment) {
        Text(
            text = houseName,
            style = MaterialTheme.typography.h5
        )
        Spacer(modifier = Modifier.padding(2.dp))
        Text(
            text = words,
            style = MaterialTheme.typography.body1,
        )
    }
}

@Composable
fun HouseHistory(houseHistory: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "History", style = MaterialTheme.typography.h5)
        Text(text = houseHistory, modifier = Modifier.padding(16.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun HouseDetailsPreview() {
    HousesOfWesterosTheme {
        HouseDetailsScreen(navController = null, houseId = 0)
    }
}


@Preview(showBackground = true)
@Composable
fun HouseListPreview() {
    HousesOfWesterosTheme {
        HouseListScreen(houses= Constants.houseList ,navController = null)
    }
}