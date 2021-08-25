package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class pdfShow extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_show);

        String pdfUrl = "https://www.clickdimensions.com/links/TestPDFfile.pdf";
        WebView webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://docs.google.com/gview?embedded=true&url=" + pdfUrl);
        webView.setWebViewClient(new WebViewClient() {
            public void onPageFinished(WebView view, String url) {
            }
        });
    }
}