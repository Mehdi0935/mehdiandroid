package ir.faranesh.mehdiandroid;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class splashscreen extends Activity {

    MediaPlayer music;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


        music = MediaPlayer.create(splashscreen .this ,R.raw.hangouts);
        music.start();


        Thread time_control = new Thread(){
            public void run() {
                try {
                    sleep(5000);

                }catch (InterruptedException e){
                    e.printStackTrace();


            }finally {
                    Intent open_activity = new Intent("android.intent.action.MENU");
                    startActivity(open_activity);

                }
                }
        };
        time_control.start();


    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
        music.release();
    }
}
