package com.example.web;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class web extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        bindding();

        String link = getIntent().getStringExtra("link");

        webView.loadUrl(link);
        webView.getSettings().setJavaScriptEnabled(true);

    }


    private void bindding() {

        webView = findViewById(R.id.web1_view);
    }


}

