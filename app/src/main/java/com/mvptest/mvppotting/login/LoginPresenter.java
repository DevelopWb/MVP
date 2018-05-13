package com.mvptest.mvppotting.login;

import com.mvptest.mvppotting.BasePresent;
import com.mvptest.mvppotting.netWork.RequestStatus;

/**
 * Author:wang_sir
 * Time:2018/5/13 15:35
 * Description:This is LoginPresenter
 */
public class LoginPresenter extends BasePresent<LoginContract.LoginViewInterface<String>> implements LoginContract.LoginPresenterInterface<LoginBean>, RequestStatus<String> {

    private final LoginModel loginModel;

    public LoginPresenter() {
        loginModel = new LoginModel();
    }


    @Override
    public void checkFormat() {

    }

    @Override
    public void requestToLogin(LoginBean bean) {
        loginModel.exec(bean, this);
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onSuccess(String s) {
        LoginContract.LoginViewInterface<String> view = getView();
        view.onLoginSuccess(s);
    }

    @Override
    public void onError() {

    }
}
