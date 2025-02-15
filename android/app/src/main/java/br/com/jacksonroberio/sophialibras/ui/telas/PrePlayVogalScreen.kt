package br.com.jacksonroberio.sophialibras.ui.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import br.com.jacksonroberio.sophialibras.R

@Composable
fun PrePlayVogalScreen(
    onPlayClick: () -> Unit
)
{

    /**
     * background amarelo
     **/
    Box()
    {
        Image (
            painter = painterResource(id = R.drawable.img_background_amarelo_1),
            contentDescription = "Imagem de fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }

    Box (
        modifier = Modifier.fillMaxHeight().clickable { onPlayClick() },
        contentAlignment =  Alignment.BottomCenter
    )
    {

        Image (
            painter = painterResource(id = R.drawable.img_professora_maria_dialogo_vogal_1),
            contentDescription = "Instrução da professora ao jogo de vogal"

        )
    }
}