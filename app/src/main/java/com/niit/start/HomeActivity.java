package com.niit.start;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.niit.start.utils.DateUtils;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        TextView home_text = findViewById(R.id.home_text);
        Button home_button = findViewById(R.id.home_button);
        home_button.setOnClickListener(new HomeButtonOnClickListener(home_text));
        home_button.setOnLongClickListener(new HomeButtonOnLongClickListener(home_text));
    }

    static class HomeButtonOnClickListener implements View.OnClickListener {
        private final TextView home_text;

        public HomeButtonOnClickListener(TextView home_text) {
            this.home_text = home_text;
        }

        @Override
        public void onClick(View view) {
            String text = DateUtils.getNowTime();
            home_text.setText(text);
        }
    }

    static class HomeButtonOnLongClickListener implements View.OnLongClickListener {
        private final TextView home_text;

        public HomeButtonOnLongClickListener(TextView home_text) {
            this.home_text = home_text;
        }

        @Override
        public boolean onLongClick(View view) {
            String text = DateUtils.getNowDate();
            home_text.setText(text);
            return true;
        }
    }
}