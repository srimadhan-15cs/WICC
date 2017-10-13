package com.example.madhan.wicc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.VideoView;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private final String PLAYBACK_VIDEO_STATE = "playbackvideo";
    private VideoView videoView;
    private int stopPosition;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        videoView = (VideoView) findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        if (savedInstanceState != null) {
            stopPosition = savedInstanceState.getInt(PLAYBACK_VIDEO_STATE);
            videoView.seekTo(stopPosition);
        }
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.getMenu().getItem(0).setChecked(true);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        stopPosition = savedInstanceState.getInt(PLAYBACK_VIDEO_STATE);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(PLAYBACK_VIDEO_STATE, stopPosition);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onPause() {
        super.onPause();
        videoView.pause();
        stopPosition = videoView.getCurrentPosition();
    }
    @Override
    public void onResume() {
        super.onResume();
        videoView.seekTo(stopPosition);
        videoView.start();
        navigationView.getMenu().getItem(0).setChecked(true);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        Intent intent;
        switch (id){
            case R.id.nav_home:
                drawer.closeDrawer(GravityCompat.START);
                break;
            case R.id.nav_speakers:
                intent = new Intent(this,SpeakerActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_organisation:
                intent = new Intent(this,OrganisationActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_events:
                intent = new Intent(this,EventActivity.class);
                startActivity(intent);
                break;
            /*case R.id.nav_timeline:
                intent = new Intent(this,TimelineActivity.class);
                startActivity(intent);
                break;*/
            case R.id.nav_register:
                intent = new Intent(this,RegisterActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_organizer:
                intent = new Intent(this,OrganizerActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_guideline:
                intent = new Intent(this,AuthorGuidelineActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_co_general_chair:
                intent = new Intent(this,CoGeneralChairActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_general_chair:
                intent = new Intent(this,GeneralChairActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_advisory_commitee:
                intent = new Intent(this,AdvisoryCommiteeActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_technical_commitee:
                intent = new Intent(this,TechnicalCommiteeActivity.class);
                startActivity(intent);
                break;
            /*case R.id.nav_track_chair:
                intent = new Intent(this,TrackChairActivity.class);
                startActivity(intent);
                break;*/
            case R.id.nav_settings:
                intent = new Intent(this,SettingsActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_share:
                intent = new Intent(this,ShareActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_about:
                intent = new Intent(this,AboutActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_honorary:
                intent = new Intent(this,HonoraryChairActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_conference:
                intent = new Intent(this,ConferenceChairActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_organizing:
                intent = new Intent(this,OrganizingChairActivity.class);
                startActivity(intent);
                break;
        }

        return true;
    }
}
