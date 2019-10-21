package com.example.mohinhmvp04092019;

public class MainPresenter {


    private LoginModel loginModel;

    public MainPresenter() {
        this.loginModel = new LoginModel();
    }

    public void validateLogin(String user, String password) {
        loginModel.checkLogin(user ,password);
    }
}
