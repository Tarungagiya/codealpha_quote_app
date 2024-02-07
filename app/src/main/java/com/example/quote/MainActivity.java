package com.example.quote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView quote,author;
    Button btn;
    ImageView share_btn;
    private final List<QuoteLists> quoteLists = new ArrayList<>();
    private int currentQuotesPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quote = findViewById(R.id.quote);
        author = findViewById(R.id.author);
        btn = findViewById(R.id.btn);
        share_btn = findViewById(R.id.share_btn);

        quoteLists.addAll(QuotesData.getQuoteLists());

        setQuoteToTextView();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentQuotesPosition++;
                if (currentQuotesPosition >= quoteLists.size()){
                    currentQuotesPosition = 0;
                }
                setQuoteToTextView();
            }
        });

    }

    private void setQuoteToTextView(){
        quote.setText(quoteLists.get(currentQuotesPosition).getQuote());
        author.setText(quoteLists.get(currentQuotesPosition).getAuthor());
    }

    public void sharequote(View view){
        Intent shareintent = new Intent(Intent.ACTION_SEND);
        shareintent.setType("text/plain");
        shareintent.putExtra(Intent.EXTRA_TEXT,quoteLists.get(currentQuotesPosition).getQuote());
        startActivity(Intent.createChooser(shareintent,"select an app"));
    }

}