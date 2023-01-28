package com.example.mirsvetav3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;

public class MainActivity extends AppCompatActivity {
    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myWebView = (WebView) findViewById(R.id.mywebview);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
//        myWebView.loadUrl("file:///android_asset/vite-app/dist/index.html");
        myWebView.loadUrl("file:///android_asset/Content/index.html");
//        String unencodedHtml =
//                "<html><body>'%23' is the percent code for ‘#‘ </body></html>";
//        String encodedHtml = Base64.encodeToString(unencodedHtml.getBytes(), Base64.NO_PADDING);
//        myWebView.loadData(encodedHtml, "text/html", "base64");
    }
}