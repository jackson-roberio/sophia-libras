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
import br.com.jacksonroberio.sophialibras.R
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jacksonroberio.sophialibras.ui.theme.goodMatch

@Composable
fun EscolhaNumeroScreen(
    onMuralClick: () -> Unit,
    onJogarClick: () -> Unit
)
{
    /**
     * background roxo
     **/
    Box(){
        Image (
            painter = painterResource(id = R.drawable.img_background_roxo_1),
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
            Column {
                Text(
                    text = stringResource(R.string.prof_dialogo_informativo_numeros_1),
                    color = Color.White,
                    fontFamily = goodMatch,
                    fontSize = 25.sp
                    ,                modifier = Modifier. padding(bottom = 15.dp)
                )

                Text(
                    text = stringResource(R.string.prof_dialogo_informativo_numeros_2),
                    color = Color.White,
                    fontFamily = goodMatch,
                    fontSize = 25.sp
                )
            }

        }

        //Parte inferior
        Box(
            Modifier.fillMaxWidth().weight(1f).align(Alignment.End),
            contentAlignment = Alignment.BottomStart
        ){
            Row {


                // Colocando a imagem da professora na parte inferior
                Image(
                    painter = painterResource(R.drawable.img_professora_maria_lado_esquerdo_1),
                    contentDescription = "Professora",
                    /*modifier = Modifier
                    .align(Alignment.Bottom) // Alinha no final da tela
                        .fillMaxWidth() // Opcional: define o tamanho da imagem como largura total
                    */
                )

                Column (
                    modifier = Modifier.align(Alignment.CenterVertically).padding(start = 25.dp)
                ) {
                    Button (
                        onClick = {  onMuralClick() },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.padding(bottom = 15.dp)
                    ) {
                        Text(
                            text = "MURAL",
                            fontSize = 25.sp,
                            fontFamily = goodMatch
                        )
                    }

                    Button(
                        onClick = { onJogarClick() },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.White,
                            contentColor = Color.Black
                        )
                    ) {
                        Text(
                            text = "JOGAR",
                            fontSize = 25.sp,
                            fontFamily = goodMatch
                        )
                    }
                }


            }
        }
    }

}
