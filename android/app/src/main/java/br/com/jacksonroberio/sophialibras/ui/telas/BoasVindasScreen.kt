package br.com.jacksonroberio.sophialibras.ui.telas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jacksonroberio.sophialibras.R
import br.com.jacksonroberio.sophialibras.ui.theme.goodMatch

@Composable
fun BoasVindasScreen(
    onJogarAlfabetoClick: () -> Unit,
    onJogarNumerosClick: () -> Unit
)
{
    /**
     * background azul
     **/
    Box(){
        Image (
            painter = painterResource(id = R.drawable.img_background_azul_1),
            contentDescription = "Imagem de fundo",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
    }


    Column (Modifier.fillMaxSize()) {

        //Parte superior
        Box(
            Modifier.fillMaxWidth().weight(1f).padding(start = 15.dp, end = 60.dp),
            contentAlignment = Alignment.BottomStart
        ){
            Text(
                text = stringResource(R.string.prof_dialogo_boas_vindas),
                color = Color.White,
                fontFamily = goodMatch,
                fontSize = 25.sp
            )
        }

        //Parte inferior
        Box(
            Modifier.fillMaxWidth().weight(1f).align(Alignment.End),
            contentAlignment = Alignment.BottomEnd
        ){
            Row ()
            {
                Column (
                    modifier = Modifier.align(Alignment.CenterVertically).padding(start = 25.dp)
                )
                {
                    Button(
                        onClick = { onJogarAlfabetoClick() },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.padding(bottom = 15.dp)
                    )
                    {
                        Text(
                            text = "ALFABETO",
                            fontSize = 25.sp,
                            fontFamily = goodMatch
                        )
                    }

                    Button(
                        onClick = { onJogarNumerosClick()  },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        )
                    )
                    {
                        Text(
                            text = "NÚMEROS",
                            fontSize = 25.sp,
                            fontFamily = goodMatch
                        )
                    }
                }

                    Image(
                        painter = painterResource(R.drawable.img_professora_maria_2),
                        contentDescription = "Professora",
                    )



            }
        }
    }



}