package com.e.myalias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSC (View view) {
        Uri uri1 = Uri.parse("https://soundcloud.com/nightowle");
        Intent web1 = new Intent(Intent.ACTION_VIEW, uri1);
        startActivity(web1);
    }
    public void clickYT (View view) {
        Uri uri2 = Uri.parse("https://www.youtube.com/channel/UCxiiz6DThWZzzEaapJeEkrw");
        Intent web2 = new Intent(Intent.ACTION_VIEW, uri2);
        startActivity(web2);
    }

    public void clickGH (View view) {
        Uri uri3 = Uri.parse("https://github.com/eimon96");
        Intent web3 = new Intent(Intent.ACTION_VIEW, uri3);
        startActivity(web3);
    }

    public void clickPSN (View view) {
        Uri uri4 = Uri.parse("https://psnprofiles.com/EiMoN---7");
        Intent web4 = new Intent(Intent.ACTION_VIEW, uri4);
        startActivity(web4);
    }

    public void clickGT (View view) {
        Uri uri5 = Uri.parse("https://gtsport-stats.com/driver/7260218");
        Intent web5 = new Intent(Intent.ACTION_VIEW, uri5);
        startActivity(web5);
    }

    public void clickMW (View view) {
        Uri uri6 = Uri.parse("https://cod.tracker.gg/modern-warfare/profile/psn/EiMoN---7/mp");
        Intent web6 = new Intent(Intent.ACTION_VIEW, uri6);
        startActivity(web6);
    }

    public void clickTWITCH (View view) {
        Uri uri7 = Uri.parse("https://www.twitch.tv/eimon96");
        Intent web7 = new Intent(Intent.ACTION_VIEW, uri7);
        startActivity(web7);
    }

    public void clickSteam (View view) {
        Uri uri8 = Uri.parse("https://steamcommunity.com/id/eimon96/");
        Intent web8 = new Intent(Intent.ACTION_VIEW, uri8);
        startActivity(web8);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.dotmenu, menu);
        return true;
    }

}