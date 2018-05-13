package com.mvptest.mvppotting.login;

/**
 * Author:wang_sir
 * Time:2018/5/7 20:36
 * Description:This is LoginBean
 */
public class LoginBean {


    private String userName;
    private String userPwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public LoginBean(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }
}
