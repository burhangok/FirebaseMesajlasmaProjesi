package com.ikibinondokuz.firebasemesajlasma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                }

                catch (Exception e) {

                }

                finally {
                    Intent toHome = new Intent(MainActivity.this,Login.class);
                    startActivity(toHome);
                    finish();
                }
            }
        }).start();
    }
}
