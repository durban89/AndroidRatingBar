package com.gowhich.androidratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RatingBar.OnRatingBarChangeListener {

    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = (RatingBar) this.findViewById(R.id.ratingBar);

        ratingBar.setMax(100);
        ratingBar.setProgress(30);

        ratingBar.setOnRatingBarChangeListener(this);
    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
        int progress = ratingBar.getProgress();

        Toast.makeText(MainActivity.this, "Progress:"+progress+" rating:"+v, Toast.LENGTH_SHORT).show();
    }
}
