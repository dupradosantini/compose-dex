package com.example.composedex.ui.elements

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedex.R
import com.example.composedex.ui.theme.ComposeDexTheme

@Composable
fun PokedexAppHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .background(
                color = MaterialTheme.colors.primary,
                shape = RoundedCornerShape(bottomEnd = 8.dp, bottomStart = 8.dp)
            )
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.poke_ball),
            contentDescription = null,
            modifier = Modifier
                .size(96.dp)
                .padding(8.dp)
        )
        Text(
            text = "Compose-Dex",
            color = MaterialTheme.colors.onPrimary,
            style = MaterialTheme.typography.h1,
            fontSize = 32.sp
        )
    }
}

@Preview
@Composable
fun TopBarPreview(){
    ComposeDexTheme {
        PokedexAppHeader()
    }
}