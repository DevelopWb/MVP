package com.mvptest.mvppotting.netWork;

/**
 * Author:wang_sir
 * Time:2018/5/7 20:29
 * Description:This is RequestStatus
 * 使用泛型是因为 请求网络成功后返回的数据类型不确定
 */
public interface RequestStatus<T> {
    void onStart();

    void onSuccess(T t);

    void onError();

}
