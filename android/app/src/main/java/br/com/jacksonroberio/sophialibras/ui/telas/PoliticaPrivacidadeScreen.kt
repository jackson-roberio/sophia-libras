package br.com.jacksonroberio.sophialibras.ui.telas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.jacksonroberio.sophialibras.R

@Composable
fun PoliticaPrivacidadeScreen(
    onBackScreenClick: () -> Unit)
{
    Column (
        modifier = Modifier.padding(horizontal = 10.dp)
                            .verticalScroll(rememberScrollState())
    )
    {
        Text(
            modifier = Modifier.align(Alignment.CenterHorizontally)
                                .padding(vertical =  30.dp),
            text = "Política de privacidade",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold

        )

        Text(
            text = "SEÇÃO I – CAPTAÇÃO DAS DADOS",
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(id = R.string.secao1_paragrafo1),
            modifier = Modifier.padding(vertical =  15.dp)
        )
        Text(
            text = stringResource(id = R.string.secao1_paragrafo2),
        )

        Text(
            text = "SEÇÃO II – CONSENTIMENTO ",
            modifier = Modifier.padding(vertical = 15.dp),
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(id = R.string.secao2_paragrafo1),
        )

        Text(
            text = "SEÇÃO III - DIVULGAÇÃO ",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 15.dp)
        )

        Text(
            text = stringResource(id = R.string.secao3_paragrafo1),
        )

        Text(
            text = "SEÇÃO IV – PLATAFORMAS",
            modifier = Modifier.padding(vertical = 15.dp),
            fontWeight = FontWeight.Bold
        )

        Text(
            text = stringResource(id = R.string.secao4_paragrafo1),
        )
        Text(
            text = stringResource(id = R.string.secao4_paragrafo2),
            modifier = Modifier.padding(vertical = 15.dp)
        )
        Text(
            text = stringResource(id = R.string.secao4_paragrafo3),
        )

        Text(
            text = "SEÇÃO V - ALTERAÇÕES PARA ESSA POLÍTICA DE PRIVACIDADE ",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(vertical = 15.dp)
        )

        Text(
            text = stringResource(id = R.string.secao5_paragrafo1),
        )
        Text(
            text = stringResource(id = R.string.secao5_paragrafo2),
            modifier = Modifier.padding(vertical = 15.dp)
        )
        Text(text = stringResource(
            id = R.string.secao5_paragrafo3),
        )

        Button(
            onClick = {onBackScreenClick()},
            modifier = Modifier.align(alignment = Alignment.End)
                                .padding(top = 15.dp, bottom = 60.dp)
        )
        {
            Text(text = "Ok!")
        }
    }
}