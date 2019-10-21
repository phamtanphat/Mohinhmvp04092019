package com.example.mohinhmvp04092019;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginModel {

    String regexEmail = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    private ResponseModel responseModel;

    public LoginModel(ResponseModel responseModel) {
       this.responseModel = responseModel;
    }
    public void checkLogin(String user, String password) {
        boolean isEmail = Pattern.matches(regexEmail, user);

        if (user.length() <= 0 && password.length() <= 0){
            responseModel.parameterIsNull();
        }else if(!isEmail){
            responseModel.inCorrectEmail();
        }else{
            if (user.equals("phatdroid123@gmail.com") && password.equals("123")){
                responseModel.loginSuccess();
            }else{
                responseModel.loginFail();
            }
        }
    }
}
