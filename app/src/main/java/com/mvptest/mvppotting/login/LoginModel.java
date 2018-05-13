package com.mvptest.mvppotting.login;

import android.text.TextUtils;

import com.mvptest.mvppotting.netWork.NetTask;
import com.mvptest.mvppotting.netWork.RequestStatus;

/**
 * Author:wang_sir
 * Time:2018/5/7 20:53
 * Description:This is LoginModel
 */
public class LoginModel implements NetTask<LoginBean> {
    @Override
    public void exec(LoginBean loginBean, RequestStatus requestStatus) {
        String name = loginBean.getUserName();
        String pwd = loginBean.getUserPwd();
        if (name == null && TextUtils.isEmpty(name)) {
            requestStatus.onError();
            return;
        }
        if (pwd == null && TextUtils.isEmpty(pwd)) {
            requestStatus.onError();
            return;
        }

        //这里处理和网络交互的逻辑
        requestStatus.onStart();
        //模拟请求网络

        if (!name.equals("18888888888")) {
            requestStatus.onError();
            return;
        } else {
            if (!pwd.equals("123456")) {
                requestStatus.onError();
                return;
            } else {
                requestStatus.onSuccess("恭喜你登录成功");
            }
        }
    }

}
