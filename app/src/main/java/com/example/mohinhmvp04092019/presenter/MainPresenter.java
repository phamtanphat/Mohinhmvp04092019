package com.example.mohinhmvp04092019.presenter;

import android.util.Log;

import com.example.mohinhmvp04092019.model.LoginModel;
import com.example.mohinhmvp04092019.model.ResponseModel;

public class MainPresenter implements ResponseModel {


    private LoginModel loginModel;

    private ResponseView responseView;

    public MainPresenter(ResponseView responseView) {
        this.responseView = responseView;
        this.loginModel = new LoginModel(this);
    }

    public void validateLogin(String user, String password) {
        loginModel.checkLogin(user ,password);
    }

    @Override
    public void parameterIsNull() {
        responseView.isNull();
    }

    @Override
    public void inCorrectEmail() {
        responseView.errorEmail();
    }

    @Override
    public void loginSuccess() {
        responseView.loginSuccessfull();
    }

    @Override
    public void loginFail() {
       responseView.loginFailture();
    }
}
