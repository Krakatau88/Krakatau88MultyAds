package com.krakatau88.samplekrakatau88ads;

import static com.krakatau88.samplekrakatau88ads.SettingAds.BACKUP_ADS;
import static com.krakatau88.samplekrakatau88ads.SettingAds.BACKUP_ADS_BANNER;
import static com.krakatau88.samplekrakatau88ads.SettingAds.BACKUP_ADS_INTERTITIAL;
import static com.krakatau88.samplekrakatau88ads.SettingAds.BACKUP_ADS_REWARDS;
import static com.krakatau88.samplekrakatau88ads.SettingAds.HIGH_PAYING_KEYWORD1;
import static com.krakatau88.samplekrakatau88ads.SettingAds.HIGH_PAYING_KEYWORD2;
import static com.krakatau88.samplekrakatau88ads.SettingAds.HIGH_PAYING_KEYWORD3;
import static com.krakatau88.samplekrakatau88ads.SettingAds.HIGH_PAYING_KEYWORD4;
import static com.krakatau88.samplekrakatau88ads.SettingAds.HIGH_PAYING_KEYWORD5;
import static com.krakatau88.samplekrakatau88ads.SettingAds.INITIALIZE_SDK;
import static com.krakatau88.samplekrakatau88ads.SettingAds.INITIALIZE_SDK_BACKUPADS;
import static com.krakatau88.samplekrakatau88ads.SettingAds.INTERVAL;
import static com.krakatau88.samplekrakatau88ads.SettingAds.MAIN_ADS_BANNER;
import static com.krakatau88.samplekrakatau88ads.SettingAds.MAIN_ADS_INTERTITIAL;
import static com.krakatau88.samplekrakatau88ads.SettingAds.MAIN_ADS_REWARDS;
import static com.krakatau88.samplekrakatau88ads.SettingAds.NATIVE_ADS_ADMOB;
import static com.krakatau88.samplekrakatau88ads.SettingAds.SELECT_ADS;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.krakatau88.krakatau88ads.Krakatau88GDPR;
import com.krakatau88.krakatau88ads.Krakatau88Banner;
import com.krakatau88.krakatau88ads.Krakatau88Initialize;
import com.krakatau88.krakatau88ads.Krakatau88Intertitial;
import com.krakatau88.krakatau88ads.Krakatau88Native;
import com.krakatau88.krakatau88ads.Krakatau88Reward;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout layAds = findViewById(R.id.layAds);
        FrameLayout nativeads = findViewById(R.id.laynative);
        RelativeLayout layAdsmall = findViewById(R.id.laysAdsmall);
        Krakatau88GDPR.loadGdpr(MainActivity.this,SELECT_ADS,true);

        /*Krakatau88Banner.MediumBanner(MainActivity.this, layAds,SettingAds.SELECT_ADS, SettingAds.MAIN_ADS_BANNER,HIGH_PAYING_KEYWORD1
        ,HIGH_PAYING_KEYWORD2,HIGH_PAYING_KEYWORD3,HIGH_PAYING_KEYWORD4,HIGH_PAYING_KEYWORD5);
        Krakatau88Banner.SmallBanner(MainActivity.this, layAdsmall,SettingAds.SELECT_ADS, SettingAds.MAIN_ADS_BANNER,HIGH_PAYING_KEYWORD1
                ,HIGH_PAYING_KEYWORD2,HIGH_PAYING_KEYWORD3,HIGH_PAYING_KEYWORD4,HIGH_PAYING_KEYWORD5);
        Krakatau88Intertitial.LoadIntertitial(MainActivity.this, SettingAds.SELECT_ADS, SettingAds.MAIN_ADS_INTERTITIAL,HIGH_PAYING_KEYWORD1
                ,HIGH_PAYING_KEYWORD2,HIGH_PAYING_KEYWORD3,HIGH_PAYING_KEYWORD4,HIGH_PAYING_KEYWORD5 );
        Krakatau88Native.SmallNativeAdmob(MainActivity.this,SELECT_ADS, SettingAds.BACKUP_ADS, nativeads, NATIVE_ADS_ADMOB,MAIN_ADS_BANNER, HIGH_PAYING_KEYWORD1
                ,HIGH_PAYING_KEYWORD2,HIGH_PAYING_KEYWORD3,HIGH_PAYING_KEYWORD4,HIGH_PAYING_KEYWORD5);
        Krakatau88Reward.LoadReward(MainActivity.this, SELECT_ADS, MAIN_ADS_REWARDS );
        Krakatau88OpenAds.ShowOpen(MainActivity.this);
         */

        switch (SELECT_ADS) {
            case "ADMOB":
                Krakatau88Initialize.SelectAdsAdmob(MainActivity.this,BACKUP_ADS,INITIALIZE_SDK_BACKUPADS);
                  Krakatau88Intertitial.LoadIntertitialAdmob(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, HIGH_PAYING_KEYWORD1,
                        HIGH_PAYING_KEYWORD2, HIGH_PAYING_KEYWORD3, HIGH_PAYING_KEYWORD4, HIGH_PAYING_KEYWORD5);
                Krakatau88Reward.LoadRewardAdmob(MainActivity.this,BACKUP_ADS,MAIN_ADS_REWARDS,BACKUP_ADS_REWARDS);
                Krakatau88Native.SmallNativeAdmob(MainActivity.this, layAds,BACKUP_ADS,NATIVE_ADS_ADMOB,BACKUP_ADS_BANNER,HIGH_PAYING_KEYWORD1,
                        HIGH_PAYING_KEYWORD2, HIGH_PAYING_KEYWORD3, HIGH_PAYING_KEYWORD4, HIGH_PAYING_KEYWORD5);

                break;
            case "APPLOVIN-M":
                Krakatau88Initialize.SelectAdsApplovinMax(MainActivity.this,BACKUP_ADS,INITIALIZE_SDK_BACKUPADS);
                Krakatau88Native.SmallNativeMax(MainActivity.this, layAds, BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                Krakatau88Reward.LoadRewardApplovinMax(MainActivity.this,BACKUP_ADS,MAIN_ADS_REWARDS,BACKUP_ADS_REWARDS);
                Krakatau88Intertitial.LoadIntertitialApplovinMax(MainActivity.this, BACKUP_ADS,MAIN_ADS_INTERTITIAL,BACKUP_ADS_INTERTITIAL);
                break;
            case "APPLOVIN-D":
                Krakatau88Banner.SmallBannerApplovinDis(MainActivity.this, layAds, BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                Krakatau88Intertitial.LoadIntertitialApplovinDis(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL);
                break;
            case "MOPUB" :
                Krakatau88Banner.SmallBannerMopub(MainActivity.this, layAds, BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
               Krakatau88Intertitial.LoadIntertitialMopub(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL,BACKUP_ADS_INTERTITIAL);
               Krakatau88Initialize.SelectAdsMopub(MainActivity.this,BACKUP_ADS,INITIALIZE_SDK,INITIALIZE_SDK_BACKUPADS);
                Krakatau88Reward.LoadRewardMopub(MainActivity.this,BACKUP_ADS,MAIN_ADS_REWARDS,BACKUP_ADS_REWARDS);

                break;
            case "STARTAPP":
                Krakatau88Banner.SmallBannerStartApp(MainActivity.this, layAds, BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                Krakatau88Intertitial.LoadIntertitialStartApp(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL);
                break;
            case "IRON":
                Krakatau88Initialize.SelectAdsIron(MainActivity.this,BACKUP_ADS,INITIALIZE_SDK,INITIALIZE_SDK_BACKUPADS);
                Krakatau88Banner.SmallBannerIron(MainActivity.this, layAds, BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
               Krakatau88Intertitial.LoadIntertitialIron(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL);
                break;
            case  "FACEBOOK":
                Krakatau88Initialize.SelectAdsFAN(MainActivity.this,SELECT_ADS,INITIALIZE_SDK_BACKUPADS);
                Krakatau88Banner.SmallBannerFAN(MainActivity.this, layAds, BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                Krakatau88Intertitial.LoadIntertitialFAN(MainActivity.this,BACKUP_ADS,MAIN_ADS_INTERTITIAL,BACKUP_ADS_INTERTITIAL);
                break;
            case "GOOGLE-ADS":
                Krakatau88Initialize.SelectAdsGoogleAds(MainActivity.this,BACKUP_ADS,INITIALIZE_SDK_BACKUPADS);
                Krakatau88Banner.SmallBannerGoogleAds(MainActivity.this, layAds, BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                Krakatau88Intertitial.LoadIntertitialGoogleAds(MainActivity.this,BACKUP_ADS,MAIN_ADS_INTERTITIAL,BACKUP_ADS_INTERTITIAL);
                Krakatau88Reward.LoadRewardGoogleAds(MainActivity.this,BACKUP_ADS,MAIN_ADS_REWARDS,BACKUP_ADS_REWARDS);

                break;
            case "UNITY":
                Krakatau88Initialize.SelectAdsUnity(MainActivity.this,BACKUP_ADS,INITIALIZE_SDK,INITIALIZE_SDK_BACKUPADS);
                Krakatau88Banner.SmallBannerUnity(MainActivity.this, layAds, BACKUP_ADS, MAIN_ADS_BANNER, BACKUP_ADS_BANNER);
                Krakatau88Intertitial.LoadIntertitialUnity(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL);
                Krakatau88Reward.LoadRewardUnity(MainActivity.this,BACKUP_ADS,MAIN_ADS_REWARDS,BACKUP_ADS_REWARDS);
                break;

        }

    }

    public void munculiklan(View view){
        switch (SELECT_ADS) {
            case "ADMOB":
                Krakatau88Intertitial.ShowIntertitialAdmob(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, INTERVAL,
                        HIGH_PAYING_KEYWORD1, HIGH_PAYING_KEYWORD2, HIGH_PAYING_KEYWORD3, HIGH_PAYING_KEYWORD4, HIGH_PAYING_KEYWORD5);
                break;
            case "APPLOVIN-D":
                Krakatau88Intertitial.ShowIntertitialApplovinDis(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, INTERVAL);
                break;
            case "APPLOVIN-M":
                Krakatau88Intertitial.ShowIntertitialApplovinMax(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, INTERVAL);
                break;
            case "IRON" :
                Krakatau88Intertitial.ShowIntertitialIron(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, INTERVAL);
                break;
            case "MOPUB" :
                Krakatau88Intertitial.ShowIntertitialMopub(MainActivity.this,BACKUP_ADS,MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, INTERVAL);
                break;
            case "STARTAPP" :
                Krakatau88Intertitial.ShowIntertitialSartApp(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, INTERVAL);
                break;
            case "FACEBOOK" :
                Krakatau88Intertitial.ShowIntertitialFAN(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, INTERVAL);

                break;
            case "GOOGLE-ADS" :
                Krakatau88Intertitial.ShowIntertitialGoogleAds(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, INTERVAL);
                break;
            case "UNITY" :
                Krakatau88Intertitial.ShowIntertitialUnity(MainActivity.this, BACKUP_ADS, MAIN_ADS_INTERTITIAL, BACKUP_ADS_INTERTITIAL, INTERVAL);
                break;
        }


    }

    public void munculreward(View view){
        switch (SELECT_ADS) {
            case "ADMOB":
                Krakatau88Reward.ShowRewardAdmob(MainActivity.this, BACKUP_ADS, MAIN_ADS_REWARDS, BACKUP_ADS_REWARDS);
                break;
            case "APPLOVIN-M":
                Krakatau88Reward.ShowRewardApplovinMax(MainActivity.this, BACKUP_ADS, MAIN_ADS_REWARDS, BACKUP_ADS_REWARDS);
                break;
            case "MOPUB":
                Krakatau88Reward.ShowRewardMopub(MainActivity.this, BACKUP_ADS, MAIN_ADS_REWARDS, BACKUP_ADS_REWARDS);
                break;
            case "GOOGLE-ADS":
                Krakatau88Reward.ShowRewardGoogleAds(MainActivity.this, BACKUP_ADS, MAIN_ADS_REWARDS, BACKUP_ADS_REWARDS);
                break;
            case "UNITY":
                Krakatau88Reward.ShowRewardUnity(MainActivity.this, BACKUP_ADS, MAIN_ADS_REWARDS, BACKUP_ADS_REWARDS);
                break;


        }
    }

    public void onResume(){
        super.onResume();
        if (Krakatau88Reward.unlockreward){
            Toast.makeText(getApplicationContext(), "OK Berhasil", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(getApplicationContext(), "gagal", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onBackPressed() {
        finishAffinity();
        System.exit(0);
        super.onBackPressed();
    }
}