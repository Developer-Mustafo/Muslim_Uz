package uz.coder.muslimuz.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import uz.coder.muslimuz.R;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {
Animation animation,animation1;
TextView textView,textView2;
ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageView = findViewById(R.id.image);
        textView = findViewById(R.id.txt);
        textView2 = findViewById(R.id.txt2);
        animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        animation1 = AnimationUtils.loadAnimation(this,R.anim.animation1);
        imageView.setAnimation(animation);
        textView.setAnimation(animation1);
        textView2.setAnimation(animation1);
        int SPLASH_SCREEN = 4500;
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, SPLASH_SCREEN);
    }
}