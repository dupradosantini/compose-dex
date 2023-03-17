package com.example.composedex.ui.elements

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedex.R
import com.example.composedex.ui.theme.ComposeDexTheme

@Composable
fun PokemonCard(
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .height(500.dp).width(350.dp),
        elevation = 6.dp,
        shape = MaterialTheme.shapes.medium,
        backgroundColor = MaterialTheme.colors.secondary
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp))
                    .background(Color.Gray)
                    .weight(5f),
                painter = painterResource(id = R.drawable.squirtle),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                text = "N°001",
                modifier = Modifier
                    .padding(8.dp)
                    .weight(0.5f),
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.onSecondary
            )
            Text(
                text = "PokeName",
                modifier = Modifier
                    .padding(16.dp)
                    .weight(1f),
                style = MaterialTheme.typography.h5,
                color = MaterialTheme.colors.onSecondary
            )
            Row(
                modifier= Modifier
                    .fillMaxWidth()
                    .weight(0.5f),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                WaterTypeBox()
                FlyingTypeBox()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LightPokeCardPreview() {
    ComposeDexTheme {
        PokemonCard(
            modifier = Modifier
                .height(500.dp)
                .width(250.dp),
        )
    }
}

@Preview(showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun DarkPokeCardPreview(){
    ComposeDexTheme {
        PokemonCard()
    }
}