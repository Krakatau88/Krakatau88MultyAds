package com.krakatau88.samplekrakatau88ads;



import static com.krakatau88.samplekrakatau88ads.SettingAds.BACKUP_ADS;
import static com.krakatau88.samplekrakatau88ads.SettingAds.INITIALIZE_SDK;
import static com.krakatau88.samplekrakatau88ads.SettingAds.INITIALIZE_SDK_BACKUPADS;
import static com.krakatau88.samplekrakatau88ads.SettingAds.SELECT_ADS;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.appcompat.app.AppCompatActivity;

import com.krakatau88.krakatau88ads.Krakatau88OpenAds;
import com.krakatau88.krakatau88ads.Krakatau88Initialize;


public class SplashActivity extends AppCompatActivity {
    private static final int REQUEST = 112;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        switch (SELECT_ADS) {
            case "ADMOB":
                Krakatau88Initialize.SelectAdsAdmob(SplashActivity.this, BACKUP_ADS, INITIALIZE_SDK);
                break;
            case "GOOGLE-ADS":
                Krakatau88Initialize.SelectAdsAdmob(SplashActivity.this, BACKUP_ADS, INITIALIZE_SDK);
                break;
            case "APPLOVIN-D":
                Krakatau88Initialize.SelectAdsApplovinDis(SplashActivity.this, BACKUP_ADS, INITIALIZE_SDK);
                break;
            case "APPLOVIN-M":
                Krakatau88Initialize.SelectAdsApplovinMax(SplashActivity.this, BACKUP_ADS, INITIALIZE_SDK);
                break;
            case "MOPUB":
                Krakatau88Initialize.SelectAdsMopub(SplashActivity.this, BACKUP_ADS, INITIALIZE_SDK, INITIALIZE_SDK_BACKUPADS);
                break;
            case "IRON":
                Krakatau88Initialize.SelectAdsIron(SplashActivity.this, BACKUP_ADS, INITIALIZE_SDK, INITIALIZE_SDK_BACKUPADS);
                break;
            case "STARTAPP":
                Krakatau88Initialize.SelectAdsStartApp(SplashActivity.this, BACKUP_ADS, INITIALIZE_SDK,INITIALIZE_SDK_BACKUPADS);
                break;
            case "UNITY":
                Krakatau88Initialize.SelectAdsUnity(SplashActivity.this,BACKUP_ADS,INITIALIZE_SDK,INITIALIZE_SDK_BACKUPADS);

                break;
        }
        Krakatau88OpenAds.LoadOpenAds(SettingAds.OPEN_ADS_ADMOB);

        new CountDownTimer(10000, 1000) {
                @Override
                public void onFinish() {

                        Intent intent = new Intent(getBaseContext(),MainActivity.class);
                        startActivity(intent);
                        finish();


                }
                @Override
                public void onTick(long millisUntilFinished) {

                }
            }.start();

    }


}
