package com.example.fadergsaluno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicializar a webview

        webView = (WebView) findViewById(R.id.webView);

        //pegar configurações da webview

        WebSettings webSettings = webView.getSettings();

        //este para sites com JS

        webSettings.setJavaScriptEnabled(true);

        //colcoar a URL

        webView.loadUrl("https://academicos.fadergs.edu.br/administracao/paginaInicial.php");

        //para abrir links dentro do APP

        webView.setWebViewClient(new WebViewClient());

    }

    //se esta em uma pagina diferente entao o botao de voltar nao vai fechar o app

    @Override
    public void onBackPressed(){
        if (webView.canGoBack()){
            webView.goBack();
        }else{
            super.onBackPressed();
        }
    }

}
