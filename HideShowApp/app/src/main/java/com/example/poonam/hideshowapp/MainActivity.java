package com.example.poonam.hideshowapp;

import android.app.Activity;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity {
    Button showBtn;
    Button hideBtn;
    View image_icon;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showBtn = (Button) findViewById(R.id.btnshow);
        hideBtn = (Button) findViewById(R.id.button);
        image_icon =findViewById(R.id.imageView);

        showBtn.setVisibility(View.INVISIBLE);

        hideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_icon.setVisibility(View.INVISIBLE);
                showBtn.setVisibility(View.VISIBLE);
                hideBtn.setVisibility(View.INVISIBLE);
            }
        });

        showBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image_icon.setVisibility(View.VISIBLE);
                showBtn.setVisibility(View.INVISIBLE);
                hideBtn.setVisibility(View.VISIBLE);
            }
        });



    }


}
