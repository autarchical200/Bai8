package org.coolstyles.broadcast;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    // Độ trễ trước khi chuyển sang màn hình chính
    private static final int SPLASH_TIME_OUT = 3000; // milliseconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Sử dụng Handler để chuyển sang MainActivity sau một khoảng thời gian
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Tạo intent để chuyển sang MainActivity
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
                // Đóng WelcomeActivity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
}
