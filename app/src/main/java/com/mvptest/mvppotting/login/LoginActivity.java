package com.mvptest.mvppotting.login;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.mvptest.mvppotting.BaseActivity;
import com.mvptest.mvppotting.R;

public class LoginActivity extends BaseActivity<LoginContract.LoginViewInterface<String>, LoginPresenter> implements View.OnClickListener,LoginContract.LoginViewInterface<String> {

    private ProgressBar mLoginPb;
    /**
     * 手机号
     */
    private EditText mUserMobileEt;
    /**
     * 密码
     */
    private EditText mUserPwdEt;
    /**
     * 登 录
     */
    private TextView mLoginConfirmTv;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void initViewLayout() {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void findViewById() {
        initView();
    }

    @Override
    public void getDate() {

    }

    @Override
    public LoginPresenter creatPresenter() {
        loginPresenter = new LoginPresenter();
        return loginPresenter;
    }

    private void initView() {
        mLoginPb = (ProgressBar) findViewById(R.id.login_pb);
        mUserMobileEt = (EditText) findViewById(R.id.user_mobile_et);
        mUserPwdEt = (EditText) findViewById(R.id.user_pwd_et);
        mLoginConfirmTv = (TextView) findViewById(R.id.login_confirm_tv);
        mLoginConfirmTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.login_confirm_tv:
                loginPresenter.checkFormat();
                loginPresenter.requestToLogin(new LoginBean(mUserMobileEt.getText().toString().trim(),mUserPwdEt.getText().toString().trim()));

                break;
        }
    }

    @Override
    public void showRequestNetDialog() {
        mLoginPb.setVisibility(View.VISIBLE);
    }

    @Override
    public void cancelRequestNetDialog() {
        mLoginPb.setVisibility(View.GONE);
    }

    @Override
    public void onCheckFormatSuccess() {

    }

    @Override
    public void onCheckFormatFail(String info) {

    }

    @Override
    public void onLoginSuccess(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoginFail(String errorInfo) {

    }
}
