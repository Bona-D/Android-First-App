package com.kmech.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText    login_pin;
    Button      btn_login;

    SharedPreferences sharedPreferences_pin;
    String SAVED_PIN = "SAVING_PIN";

    String      pin_l;
    String      pin_r;

    @Override
    public void onBackPressed() {
        Toast.makeText(getBaseContext(),"Please Logged In",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        login_pin       = (EditText) findViewById(R.id.login_pin);
        btn_login       = (Button) findViewById(R.id.btn_login);

        sharedPreferences_pin = getSharedPreferences(SAVED_PIN, MODE_PRIVATE);
        pin_r = sharedPreferences_pin.getString("PIN","");

        Toast.makeText(getBaseContext(),"Registered PIN "+ pin_r, Toast.LENGTH_LONG).show();


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                pin_l = login_pin.getText().toString();

                if(pin_l.equals("")){

                    Toast.makeText(getBaseContext(),"Enter The PIN",Toast.LENGTH_SHORT).show();

                }
                else {


                    if(pin_l.equals(pin_r)){
                        Intent intent = new Intent(Login.this,Home.class);
                        startActivity(intent);

                    }

                    else {
                        Toast.makeText(getBaseContext(),"Enter The Correct PIN",Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

    }
}