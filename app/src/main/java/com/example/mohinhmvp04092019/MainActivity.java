package com.example.mohinhmvp04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtUser,edtPassword;
    Button btnLogin;
    MainPresenter mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = findViewById(R.id.edittextUser);
        edtPassword = findViewById(R.id.edittextPassword);
        btnLogin = findViewById(R.id.buttonLogin);
        mainPresenter = new MainPresenter();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtUser.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                mainPresenter.validateLogin(user,password);
            }
        });
    }
}
