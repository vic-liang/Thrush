package org.eddy.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Justice-love on 2017/7/5.
 */
@ConfigurationProperties("thrush.url")
@Component
public class UrlConfig {

    public static String initUrl;

    public static String loginCaptcha;

    public static String refreshLoginCaptcha;

    public static String auth;

    public static String checkCode;

    public static String loginUrl;

    public static String uamtk;

    public static String authClient;

    public static String stationName;

    public static String passenger;

    public static String ticketQuery;

    public static String checkUser;

    public static String submitOrderRequest;

    public static String checkOrderInfo;

    public static String initDc;

    public static String getQueueCount;

    public static String confirmSingleForQueue;

    public static String queryOrderWaitTime;

    public static String resultOrderForDcQueue;

    public void setResultOrderForDcQueue(String resultOrderForDcQueue) {
        UrlConfig.resultOrderForDcQueue = resultOrderForDcQueue;
    }

    public void setQueryOrderWaitTime(String queryOrderWaitTime) {
        UrlConfig.queryOrderWaitTime = queryOrderWaitTime;
    }

    public void setConfirmSingleForQueue(String confirmSingleForQueue) {
        UrlConfig.confirmSingleForQueue = confirmSingleForQueue;
    }

    public void setGetQueueCount(String getQueueCount) {
        UrlConfig.getQueueCount = getQueueCount;
    }

    public void setInitDc(String initDc) {
        UrlConfig.initDc = initDc;
    }

    public void setCheckOrderInfo(String checkOrderInfo) {
        UrlConfig.checkOrderInfo = checkOrderInfo;
    }

    public void setSubmitOrderRequest(String submitOrderRequest) {
        UrlConfig.submitOrderRequest = submitOrderRequest;
    }

    public void setCheckUser(String checkUser) {
        UrlConfig.checkUser = checkUser;
    }

    public void setTicketQuery(String ticketQuery) {
        UrlConfig.ticketQuery = ticketQuery;
    }

    public void setPassenger(String passenger) {
        UrlConfig.passenger = passenger;
    }

    public void setStationName(String stationName) {
        UrlConfig.stationName = stationName;
    }

    public void setAuthClient(String authClient) {
        UrlConfig.authClient = authClient;
    }

    public void setUamtk(String uamtk) {
        UrlConfig.uamtk = uamtk;
    }

    public void setInitUrl(String initUrl) {
        UrlConfig.initUrl = initUrl;
    }

    public void setLoginCaptcha(String loginCaptcha) {
        UrlConfig.loginCaptcha = loginCaptcha;
    }

    public void setRefreshLoginCaptcha(String refreshLoginCaptcha) {
        UrlConfig.refreshLoginCaptcha = refreshLoginCaptcha;
    }

    public void setAuth(String auth) {
        UrlConfig.auth = auth;
    }

    public void setCheckCode(String checkCode) {
        UrlConfig.checkCode = checkCode;
    }

    public void setLoginUrl(String loginUrl) {
        UrlConfig.loginUrl = loginUrl;
    }
}
