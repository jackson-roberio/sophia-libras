package br.com.jacksonroberio.sophialibras.ui.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.jacksonroberio.sophialibras.R

@Composable
fun MuralNumerosScreen(onVoltarClick: () -> Unit) {

    /**
     * background laranja
     **/
    Box(Modifier.background(Color(0xffffb81d)))
    {
        Image(
            painter = painterResource(id = R.drawable.img_background_amarelo_1),
            contentDescription = "Imagem de fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }

    Column() {
        Image(
            painter = painterResource(R.drawable.img_palavra_numeros_1),
            contentDescription = "Palavra Números",
            modifier = Modifier.padding(15.dp)
        )

        Row(modifier = Modifier.align(Alignment.CenterHorizontally).padding(15.dp))
        {
            Image(
                painter = painterResource(R.drawable.img_libras_numero_1_1),
                contentDescription = "Número 1 em libras"
            )

            Image(
                painter = painterResource(R.drawable.img_libras_numero_2_1),
                contentDescription = "Número 2 em libras",
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Image(
                painter = painterResource(R.drawable.img_libras_numero_3_1),
                contentDescription = "Número 3 em libras"
            )

        }

        Row(modifier = Modifier.align(Alignment.CenterHorizontally).padding(15.dp))
        {
            Image(
                painter = painterResource(R.drawable.img_libras_numero_4_1),
                contentDescription = "Número 4 em libras"
            )

            Image(
                painter = painterResource(R.drawable.img_libras_numero_5_1),
                contentDescription = "Número 5 em libras",
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Image(
                painter = painterResource(R.drawable.img_libras_numero_6_1),
                contentDescription = "Número 6 em libras"
            )

        }

        Row(modifier = Modifier.align(Alignment.CenterHorizontally).padding(15.dp))
        {
            Image(
                painter = painterResource(R.drawable.img_libras_numero_7_1),
                contentDescription = "Número 7 em libras"
            )

            Image(
                painter = painterResource(R.drawable.img_libras_numero_8_1),
                contentDescription = "Número 8 em libras",
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Image(
                painter = painterResource(R.drawable.img_libras_numero_9_1),
                contentDescription = "Número 9 em libras"
            )

        }

        Row (modifier = Modifier.align(Alignment.End))
        {
            Image(
                painter = painterResource(R.drawable.img_botao_voltar_cor_roxa_1),
                contentDescription = "Botão voltar",
                modifier = Modifier.padding(top = 20.dp).clickable { onVoltarClick()  },

                )
        }

    }
}