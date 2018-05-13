package com.mvptest.mvppotting.netWork;

/**
 * Author:wang_sir
 * Time:2018/5/7 20:28
 * Description:This is NetTask
 */
public interface NetTask<T> {

    /**
     *
     * @param t  请求参数类型不确定
     * @param requestStatus  网络请求状态回调
     */
    void exec(T t, RequestStatus requestStatus);
}
