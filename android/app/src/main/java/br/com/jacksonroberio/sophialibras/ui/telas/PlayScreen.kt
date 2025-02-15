package br.com.jacksonroberio.sophialibras.ui.telas

import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView

@Composable
fun PlayScreen(modifier: Modifier = Modifier) {

    val context = LocalContext.current

    val URL by remember { mutableStateOf("https://jackson-roberio.github.io/sophia-libras/fase/numeros/index.html") }

    val onBackPressedDispatcher = LocalOnBackPressedDispatcherOwner.current?.onBackPressedDispatcher

    val webView = remember {
        android.webkit.WebView(context).apply {
            layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.MATCH_PARENT)

            settings.javaScriptEnabled = true
            webViewClient = android.webkit.WebViewClient()

            loadUrl(URL)

        }
    }


    DisposableEffect(webView) {
        val callback = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                if(webView.canGoBack()){
                    webView.goBack()
                }
            }
        }
        onBackPressedDispatcher?.addCallback(callback)

        onDispose { callback.remove() }
    }

    AndroidView(factory = {webView}, modifier)
}

