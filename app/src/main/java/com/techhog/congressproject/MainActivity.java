package com.techhog.congressproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LoginBtn = (Button) findViewById(R.id.LoginBtn);
        LoginBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                EditText LoginEmailTextField = (EditText) findViewById(R.id.LoginEmailTextField);
                EditText LoginPasswordTextField = (EditText) findViewById(R.id.LoginPasswordTextField);
                TextView resultTextView = (TextView) findViewById(R.id.ResultText);

                String email = LoginEmailTextField.getText().toString();
                String password = LoginPasswordTextField.getText().toString();

                if(email.equals("hongwang767@gmail.com")){
                    if(password.equals("hello")){
                        resultTextView.setText("Success!");
                    }
                }
            }
        });
    }
}
