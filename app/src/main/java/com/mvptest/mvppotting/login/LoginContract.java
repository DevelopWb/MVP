package com.mvptest.mvppotting.login;

/**
 * Author:wang_sir
 * Time:2018/5/13 15:13
 * Description:This is LoginContract
 */
public class LoginContract {

    /**
     * 登录展示需要的方法，登录类实现
     */
    public interface LoginViewInterface<T> {
        void showRequestNetDialog();//展示请求网络的dialog
        void cancelRequestNetDialog();//取消dialog

        void onCheckFormatSuccess();

        void onCheckFormatFail(String info);

        void onLoginSuccess(T t);

        void onLoginFail(String errorInfo);
    }

    /**
     * 登录逻辑。登录的presenter实现。
     */
    public interface LoginPresenterInterface<T> {

        void checkFormat();//检查格式

        void requestToLogin(T t);//请求登录
    }
}
