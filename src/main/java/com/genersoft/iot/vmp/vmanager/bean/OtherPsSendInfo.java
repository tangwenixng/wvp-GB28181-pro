package com.genersoft.iot.vmp.vmanager.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OtherPsSendInfo {

    /**
     * 发流IP
     */
    private String sendLocalIp;

    /**
     * 发流端口
     */
    private int sendLocalPort;

    /**
     * 收流IP
     */
    private String receiveIp;

    /**
     * 收流端口
     */
    private int receivePort;


    /**
     * 会话ID
     */
    private String callId;

    /**
     * 流ID
     */
    private String stream;

    /**
     * 推流应用名
     */
    private String pushApp;

    /**
     * 推流流ID
     */
    private String pushStream;

    /**
     * 推流SSRC
     */
    private String pushSSRC;

    @Override
    public String toString() {
        return "OtherPsSendInfo{" +
                "sendLocalIp='" + sendLocalIp + '\'' +
                ", sendLocalPort=" + sendLocalPort +
                ", receiveIp='" + receiveIp + '\'' +
                ", receivePort=" + receivePort +
                ", callId='" + callId + '\'' +
                ", stream='" + stream + '\'' +
                ", pushApp='" + pushApp + '\'' +
                ", pushStream='" + pushStream + '\'' +
                ", pushSSRC='" + pushSSRC + '\'' +
                '}';
    }
}
