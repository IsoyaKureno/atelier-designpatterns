package fr.wildcodeschool.atelierdesignpatterns;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NewsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        TextView headline = findViewById(R.id.newsitem_headline);
        TextView content = findViewById(R.id.newsitem_content);

        // TODO : show headline and content
        NewsModel newsModel = getIntent().getParcelableExtra("NewsModel");
        headline.setText(newsModel.getHeadline());
        content.setText(newsModel.getNewsContent());
    }
}
