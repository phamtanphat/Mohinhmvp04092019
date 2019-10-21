package com.example.mohinhmvp04092019.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mohinhmvp04092019.presenter.MainPresenter;
import com.example.mohinhmvp04092019.R;
import com.example.mohinhmvp04092019.presenter.ResponseView;

public class MainActivity extends AppCompatActivity implements ResponseView {

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
        mainPresenter = new MainPresenter(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtUser.getText().toString().trim();
                String password = edtPassword.getText().toString().trim();

                mainPresenter.validateLogin(user,password);
            }
        });
    }

    @Override
    public void isNull() {
        Toast.makeText(this, "Người dùng chưa nhập thông tin", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void errorEmail() {
        Toast.makeText(this, "Người dùng nhập sai định dạng email", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginSuccessfull() {
        Toast.makeText(this, "Thành công", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void loginFailture() {
        Toast.makeText(this, "Thất bại", Toast.LENGTH_SHORT).show();

    }
}
