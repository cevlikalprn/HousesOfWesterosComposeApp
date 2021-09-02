package com.cevlikalprn.housesofwesteros

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.cevlikalprn.housesofwesteros.ui.theme.HousesOfWesterosTheme
import com.cevlikalprn.housesofwesteros.ui.theme.myCardBackgroundColor

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
fun HouseListScreen(houses: List<HouesesOfWesteros> = Constants.houseList) {
    Scaffold(
        topBar = { AppBar(title = "Houeses of Westeros", icon = Icons.Default.Home)}
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.LightGray)
        ) {
            LazyColumn{
                items(items = houses){ house ->
                    HouseCard(house = house)
                }
            }
        }
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
        )
        },
        backgroundColor = MaterialTheme.colors.background
    )
}

@Composable
fun HouseCard(house: HouesesOfWesteros) {
    Card(
        modifier = Modifier
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
            HousePicture(housePicture = house.housePicture)
            HouseContent(
                houseName = house.houseName,
                words = house.houseWords
            )
        }
    }
}

@Composable
fun HousePicture(housePicture: String) {
    Surface(
        modifier = Modifier.padding(12.dp),
        shape = CircleShape,
        border = BorderStroke(width = 2.dp, color = MaterialTheme.colors.myCardBackgroundColor)
    ) {
        Image(
            painter = rememberImagePainter(
                data = housePicture,
                builder = {crossfade(true)}
            ),
            contentDescription = "house picture",
            modifier = Modifier.size(90.dp),
            contentScale = ContentScale.Fit
        )

    }
}

@Composable
fun HouseContent(houseName: String, words: String) {
    Column {
        Text(
            text = houseName,
            style = MaterialTheme.typography.h5
        )
        Text(
            text = words,
            style = MaterialTheme.typography.body1
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HousesOfWesterosTheme {
        HouseListScreen()
    }
}