package com.kmech.intern.Registration;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.kmech.intern.R;

public class Registration extends AppCompatActivity {


    EditText                    register_pin;
    Button                      btn_register;

    SharedPreferences           sharedPreferences_pin;
    SharedPreferences.Editor    sharedPreferences_editor;
    String                      SAVED_PIN = "SAVING_PIN";

    String                      pin_r;


            // ***** After Registration Need to open Login Page
    protected void onStart() {
         super.onStart();

         sharedPreferences_pin         = getSharedPreferences(SAVED_PIN, MODE_PRIVATE);
         if(sharedPreferences_pin.contains("PIN")){

             Intent intent = new Intent(Registration.this,Login.class);
             startActivity(intent);

             Toast.makeText(getBaseContext(),"Activity Started",Toast.LENGTH_SHORT).show();

         }
    }
                // After Registration Need to open Login Page *****



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        register_pin    = (EditText) findViewById(R.id.register_pin);
        btn_register    = (Button) findViewById(R.id.btn_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(register_pin.length() != 4){
                    Toast.makeText(getBaseContext(),"Please Enter four Digit PIN ",Toast.LENGTH_SHORT).show();

                }
                else{

                    pin_r   = register_pin.getText().toString();

                    sharedPreferences_editor      = sharedPreferences_pin.edit();
                    sharedPreferences_editor.putString("PIN", pin_r);
                    sharedPreferences_editor.apply();

                    Intent intent   = new Intent(Registration.this, Home.class);
                    startActivity(intent);

                    Toast.makeText(getBaseContext(),"PIN Number Saved" ,Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
