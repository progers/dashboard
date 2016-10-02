package gg.pr.dashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.webkit.WebViewClient;

import static android.webkit.WebSettings.LOAD_NO_CACHE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.setWebContentsDebuggingEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setCacheMode(LOAD_NO_CACHE);
        myWebView.loadUrl("https://pr.gg/dashboard");
    }
}

