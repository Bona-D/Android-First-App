package com.kmech.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignOut extends AppCompatActivity {

    Button  btn_quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_out);

        btn_quit       = (Button) findViewById(R.id.btn_quit);

        btn_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getBaseContext(),Login.class);
                startActivity(intent);
            }
        });
    }
}