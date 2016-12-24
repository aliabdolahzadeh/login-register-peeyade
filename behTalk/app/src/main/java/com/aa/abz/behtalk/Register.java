package com.aa.abz.behtalk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ali on 12/22/2016.
 */


public class Register extends Activity {
    Button signUp;
    EditText Username, email, mobileNum, password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        Username = (EditText) findViewById(R.id.Username);
        email = (EditText) findViewById(R.id.email);
        mobileNum = (EditText) findViewById(R.id.mobileNum);
        password = (EditText) findViewById(R.id.password);
        signUp = (Button) findViewById(R.id.signUp);

        final String usernamer= Username.getText().toString();
          final String emailadressr= email.getText().toString();
          final String numberr= mobileNum.getText().toString();
          final String passwordr= password.getText().toString();


        signUp.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                if (TextUtils.isEmpty(Username.getText()) || Username.getText().length() < 2 || password.getText().length() > 32) {
                    Toast.makeText(getApplicationContext(), "نام ونام خانوادگی باید بین 2تا32 حرف باشد", Toast.LENGTH_LONG).show();

                } else {
                    if (TextUtils.isEmpty(email.getText()) || !android.util.Patterns.EMAIL_ADDRESS.matcher(email.getText()).matches()) {
                        Toast.makeText(getApplicationContext(), "ایمیل را وارد نمایید", Toast.LENGTH_LONG).show();
                    } else {
                        if (TextUtils.isEmpty(mobileNum.getText())) {
                            Toast.makeText(getApplicationContext(), "شماره تلفن را درست وارد نمایید", Toast.LENGTH_LONG).show();
                        } else {
                            if (TextUtils.isEmpty(password.getText()) || password.getText().length() < 8 || password.getText().length() > 32) {
                                Toast.makeText(getApplicationContext(), "رمز عبور باید بین 8 تا 32 کلمه باشد", Toast.LENGTH_LONG).show();
                            } else {
                                Intent intent = new Intent(Register.this, ActivitionCode.class);

                                startActivity(intent);

                            }
                        }
                    }
                }
            }
        });
    }






}