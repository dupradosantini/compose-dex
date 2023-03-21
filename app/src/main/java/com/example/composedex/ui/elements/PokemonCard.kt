package com.example.composedex.ui.elements

import android.content.res.Configuration
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.composedex.R
import com.example.composedex.model.GenericType
import com.example.composedex.model.Pokemon
import com.example.composedex.model.PokemonType
import com.example.composedex.ui.theme.ComposeDexTheme
import com.example.composedex.utils.assembleImageUrl
import com.example.composedex.utils.formatNumber
import java.util.*

@Composable
fun PokemonCard(
    modifier: Modifier = Modifier,
    pokemon: Pokemon
) {
    Card(
        modifier = modifier
            .height(500.dp)
            .width(350.dp),
        elevation = 6.dp,
        shape = MaterialTheme.shapes.medium,
        backgroundColor = MaterialTheme.colors.secondary
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            AsyncImage(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp))
                    .background(Color.Gray)
                    .weight(5f),
                model = ImageRequest.Builder(LocalContext.current)
                    .data(assembleImageUrl(pokemon.id))
                    .crossfade(500)
                    .build(),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                placeholder = painterResource(id = R.drawable.poke_ball)
            )
            Text(
                text = "N°${formatNumber(pokemon.id)}",
                modifier = Modifier
                    .paddingFromBaseline(12.dp)
                    .padding(horizontal = 16.dp)
                    .weight(0.5f),
                style = MaterialTheme.typography.body2,
                color = MaterialTheme.colors.onSecondary
            )
            Text(
                text = pokemon.name.replaceFirstChar {
                    if (it.isLowerCase()) it.titlecase(Locale.getDefault())
                    else it.toString()
                },
                modifier = Modifier
                    .paddingFromBaseline(16.dp)
                    .padding(horizontal = 16.dp)
                    .weight(0.75f),
                style = MaterialTheme.typography.h5,
                color = MaterialTheme.colors.onSecondary
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.75f),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                for (type in pokemon.types) {
                    when (type.type.name) {
                        "grass" -> GrassTypeBox()
                        "water" -> WaterTypeBox()
                        "fire" -> FireTypeBox()
                        "electric" -> ElectricTypeBox()
                        "flying" -> FlyingTypeBox()
                        "bug" -> BugTypeBox()
                        "ground" -> GroundTypeBox()
                        "poison" -> PoisonTypeBox()
                        "normal" -> NormalTypeBox()
                        "psychic" -> PsychicTypeBox()
                        "fighting" -> FightingTypeBox()
                        "fairy" -> FairyTypeBox()
                        "ghost" -> GhostTypeBox()
                        "ice" -> IceTypeBox()
                        "steel" -> SteelTypeBox()
                        "rock" -> RockTypeBox()
                        else -> DragonTypeBox()
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LightPokeCardPreview() {
    val type = PokemonType(1, GenericType("water"))
    val pokemon = Pokemon(1, "Squirtle", listOf(type))
    ComposeDexTheme {
        PokemonCard(
            pokemon = pokemon
        )
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun DarkPokeCardPreview() {
    val type = PokemonType(1, GenericType("water"))
    val pokemon = Pokemon(1, "Squirtle", listOf(type))
    ComposeDexTheme {
        PokemonCard(pokemon = pokemon)
    }
}