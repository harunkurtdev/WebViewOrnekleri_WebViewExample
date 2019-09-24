package com.example.lab08.webviewkullanimi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = findViewById(R.id.webView); //Web sayfalarını göstermek için kullanılır.

        webView.getSettings().setJavaScriptEnabled(true); //JavaScript desteği etkin hale gelir.
        webView.loadUrl("http://ibb.ist"); //web sayfasını açar
        WebClient client = new WebClient();
        webView.setWebViewClient(client);
        //
    }

    private class WebClient extends WebViewClient{

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            //Tıklanılan bağlantı yine aynı webview nesnesi üzerinde gösterilir.

            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}
