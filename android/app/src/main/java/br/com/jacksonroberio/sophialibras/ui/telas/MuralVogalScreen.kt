package br.com.jacksonroberio.sophialibras.ui.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
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
fun MuralVogalScreen(onVoltarClick: () -> Unit)
{
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
            painter = painterResource(R.drawable.img_palavra_alfabeto_1),
            contentDescription = "Palavra Alfabeto",
            modifier = Modifier.padding(15.dp)
        )

        Row(modifier = Modifier.align(Alignment.CenterHorizontally).padding(15.dp))
        {
            Image(
                painter = painterResource(R.drawable.img_libras_letra_a_1),
                contentDescription = "Letra A em libras"
            )

            Image(
                painter = painterResource(R.drawable.img_libras_letra_e_1),
                contentDescription = "Letra E em libras",
                modifier = Modifier.padding(horizontal = 20.dp)
            )

            Image(
                painter = painterResource(R.drawable.img_libras_letra_i_1),
                contentDescription = "Letra I em libras"
            )

        }

        Row(modifier = Modifier.align(Alignment.CenterHorizontally).padding(15.dp))
        {
            Image(
                painter = painterResource(R.drawable.img_libras_letra_o_1),
                contentDescription = "Letra O em libras"
            )

            Image(
                painter = painterResource(R.drawable.img_libras_letra_u_1),
                contentDescription = "Número 5 em libras",
                modifier = Modifier.padding(horizontal = 20.dp)
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