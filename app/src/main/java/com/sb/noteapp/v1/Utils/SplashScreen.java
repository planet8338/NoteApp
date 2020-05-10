package com.sb.noteapp.v1.Utils;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import com.sb.noteapp.v1.Activity.LoginActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, LoginActivity.class));

    }
    public void onBackPressed(){
        moveTaskToBack(true);
    }

}
