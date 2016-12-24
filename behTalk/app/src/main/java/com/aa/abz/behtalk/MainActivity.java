package com.aa.abz.behtalk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    private static Button b1;
    private static EditText ed1, ed2;
    private static TextView tx1;



   // private String URL = "http://lamiday.ir/api/v1/users/login";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        ed1 = (EditText) findViewById(R.id.username);
        ed2 = (EditText) findViewById(R.id.password);


        tx1 = (TextView) findViewById(R.id.newUser);
        tx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Register.class);

                startActivity(myIntent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (ed1.getText().toString().equals("admin") ||
                        ed2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(),
                            "در حال ارتباط", Toast.LENGTH_SHORT).show();
                } else {


                    Toast.makeText(getApplicationContext(), "رمز یا ایمیل اشتباه است", Toast.LENGTH_SHORT).show();
                }
            }

        });


    }


}