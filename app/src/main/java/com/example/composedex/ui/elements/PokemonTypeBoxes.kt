package com.example.composedex.ui.elements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composedex.ui.theme.ComposeDexTheme


@Composable
fun FireTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFFFD7D24)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Fire",
            color = Color.White
        )
    }
}

@Composable
fun GrassTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFF9BCC50)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Grass",
            color = Color.Black
        )
    }
}

@Composable
fun PoisonTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFFB97FC9)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Poison",
            color = Color.White
        )
    }
}

@Composable
fun ElectricTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFFEED535)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Electric",
            color = Color.Black
        )
    }
}

@Composable
fun WaterTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFF4592C4)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Water",
            color = Color.White
        )
    }
}

@Composable
fun BugTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFF729F3F)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Bug",
            color = Color.White
        )
    }
}

@Composable
fun NormalTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFFA4ACAF)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Normal",
            color = Color.Black
        )
    }
}

@Composable
fun FairyTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFFFDB9E9)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Fairy",
            color = Color.Black
        )
    }
}

@Composable
fun RockTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFFA38C21)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Rock",
            color = Color.White
        )
    }
}

@Composable
fun PsychicTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFFF366B9)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Psychic",
            color = Color.White
        )
    }
}

@Composable
fun FightingTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFFD56723)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Fighting",
            color = Color.White
        )
    }
}

@Composable
fun GhostTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFF7B62A3)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Ghost",
            color = Color.White
        )
    }
}

@Composable
fun IceTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFF51C4E7)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Ice",
            color = Color.Black
        )
    }
}

@Composable
fun SteelTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(Color(0xFF9EB7B8)),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Steel",
            color = Color.Black
        )
    }
}

@Composable
fun FlyingTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0xFF3DC7EF),
                    Color(0xFFBDB9B8)
                )
            )
        ),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Flying",
            color = Color.Black
        )
    }
}

@Composable
fun GroundTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0xFFF7DE3F),
                    Color(0xFFAB9842)
                )
            )
        ),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Ground",
            color = Color.Black
        )
    }
}

@Composable
fun DragonTypeBox(){
    Box(modifier = Modifier
        .width(100.dp)
        .height(25.dp)
        .clip(MaterialTheme.shapes.medium)
        .background(
            brush = Brush.verticalGradient(
                colors = listOf(
                    Color(0xFF53A4CF),
                    Color(0xFFF16E57)
                )
            )
        ),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Flying",
            color = Color.White
        )
    }
}





// -------------- PREVIEWS ----------------

@Preview
@Composable
fun FirePreview(){
    ComposeDexTheme {
        FireTypeBox()
    }
}

@Preview
@Composable
fun GrassPreview(){
    ComposeDexTheme {
        GrassTypeBox()
    }
}

@Preview
@Composable
fun PoisonPreview(){
    ComposeDexTheme {
        PoisonTypeBox()
    }
}

@Preview
@Composable
fun WaterPreview(){
    ComposeDexTheme {
        WaterTypeBox()
    }
}

@Preview
@Composable
fun BugPreview(){
    ComposeDexTheme {
        BugTypeBox()
    }
}

@Preview
@Composable
fun IcePreview(){
    ComposeDexTheme {
        IceTypeBox()
    }
}

@Preview
@Composable
fun ElectricPreview(){
    ComposeDexTheme {
        ElectricTypeBox()
    }
}

@Preview
@Composable
fun SteelPreview(){
    ComposeDexTheme {
        SteelTypeBox()
    }
}

@Preview
@Composable
fun GhostPreview(){
    ComposeDexTheme {
        GhostTypeBox()
    }
}

@Preview
@Composable
fun PsychicPreview(){
    ComposeDexTheme {
        PsychicTypeBox()
    }
}

@Preview
@Composable
fun FairyPreview(){
    ComposeDexTheme {
        FairyTypeBox()
    }
}

@Preview
@Composable
fun FightingPreview(){
    ComposeDexTheme {
        FightingTypeBox()
    }
}

@Preview
@Composable
fun NormalPreview(){
    ComposeDexTheme {
        NormalTypeBox()
    }
}

@Preview
@Composable
fun RockPreview(){
    ComposeDexTheme {
        RockTypeBox()
    }
}

@Preview
@Composable
fun FlyingPreview(){
    ComposeDexTheme {
        FlyingTypeBox()
    }
}

@Preview
@Composable
fun GroundPreview(){
    ComposeDexTheme {
        GroundTypeBox()
    }
}

@Preview
@Composable
fun DragonPreview(){
    ComposeDexTheme {
        DragonTypeBox()
    }
}
