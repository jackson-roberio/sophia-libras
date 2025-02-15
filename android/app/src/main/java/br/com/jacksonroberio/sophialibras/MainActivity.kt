package br.com.jacksonroberio.sophialibras

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.jacksonroberio.sophialibras.ui.telas.BoasVindasScreen
import br.com.jacksonroberio.sophialibras.ui.telas.EscolhaNumeroScreen
import br.com.jacksonroberio.sophialibras.ui.telas.EscolhaVogalScreen
import br.com.jacksonroberio.sophialibras.ui.telas.InicioScreen
import br.com.jacksonroberio.sophialibras.ui.telas.MuralNumerosScreen
import br.com.jacksonroberio.sophialibras.ui.telas.MuralVogalScreen
import br.com.jacksonroberio.sophialibras.ui.telas.PlayScreen
import br.com.jacksonroberio.sophialibras.ui.telas.PlayVogalSceen
import br.com.jacksonroberio.sophialibras.ui.telas.PoliticaPrivacidadeScreen
import br.com.jacksonroberio.sophialibras.ui.telas.PrePlayNumerosScreen
import br.com.jacksonroberio.sophialibras.ui.telas.PrePlayVogalScreen
import br.com.jacksonroberio.sophialibras.ui.theme.SophiaLibrasTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SophiaLibrasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "inicio"){
                        composable("inicio") {
                            InicioScreen(
                                onPlayClick = {navController.navigate("jogar")},
                                onAboutTheGameClick = {navController.navigate("politicaPrivacidade")}
                            )
                        }

                        composable("jogar") {
                            BoasVindasScreen(
                                onJogarAlfabetoClick = {navController.navigate("escolhaVogal")},
                                onJogarNumerosClick = {navController.navigate("escolhaNumeros")}
                            )
                        }

                        composable("politicaPrivacidade"){
                            PoliticaPrivacidadeScreen(
                                onBackScreenClick = {navController.popBackStack()}
                            )
                        }

                        /**********************
                         * MÓDULO NÚMEROS
                         *********************/
                        composable("escolhaNumeros") {
                            EscolhaNumeroScreen (
                                onMuralClick = {navController.navigate("muralNumeros")},
                                onJogarClick = {navController.navigate("prePlayNumeros")}
                            )
                        }

                        composable("muralNumeros")
                        {
                            MuralNumerosScreen(onVoltarClick = {navController. popBackStack()})
                        }

                        composable("prePlayNumeros") {
                            PrePlayNumerosScreen (
                                onPlayClick = {navController.navigate("jogarNumeros")}
                            )
                        }

                        composable("jogarNumeros") {
                            PlayScreen(Modifier.fillMaxSize())
                        }


                        /**********************
                         * MÓDULO VOGAL/ALFABETO
                         *********************/
                        composable("escolhaVogal") {
                            EscolhaVogalScreen (
                                onMuralClick = {navController.navigate("muralVogal")},
                                onJogarClick = {navController.navigate("prePlayVogal")}
                            )
                        }

                        composable("muralVogal")
                        {
                            MuralVogalScreen(onVoltarClick = {navController. popBackStack()})
                        }

                        composable("prePlayVogal") {
                            PrePlayVogalScreen (
                                onPlayClick = {navController.navigate("jogarVogal")}
                            )
                        }

                        composable("jogarVogal") {
                            PlayVogalSceen()
                        }

                    }
                }
            }
        }
    }
}