package com.aa.abz.behtalk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by ali on 12/22/2016.
 */
public class ActivitionCode extends Activity {
    Button button1;
    EditText activitionCode;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activition_code);
        button1 = (Button) findViewById(R.id.button1);
        activitionCode = (EditText) findViewById(R.id.actionCode);



            button1.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {

                if (activitionCode.getText().toString().equals("0")) {
                    Toast.makeText(getApplicationContext(),
                            "کد دسترسی صحیح می باشد ", Toast.LENGTH_SHORT).show();

                } else {


                    Toast.makeText(getApplicationContext(),
                            "کد دسترسی صحیح نمی باشد ", Toast.LENGTH_SHORT).show();



                }


            }
        });
    }

}