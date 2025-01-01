package com.genersoft.iot.vmp.media.zlm.dto.hook;

import lombok.Getter;
import lombok.Setter;

/**
 * zlm hook事件中的on_publish事件的参数
 *
 * @author lin
 */

@Setter
@Getter
public class OnPublishHookParam extends HookParam {

    private String id;

    private String app;

    private String stream;

    private String ip;

    private String params;

    private int port;

    private String schema;

    private String vhost;


    @Override
    public String toString() {
        return "OnPublishHookParam{" +
                "id='" + id + '\'' +
                ", app='" + app + '\'' +
                ", stream='" + stream + '\'' +
                ", ip='" + ip + '\'' +
                ", params='" + params + '\'' +
                ", port=" + port +
                ", schema='" + schema + '\'' +
                ", vhost='" + vhost + '\'' +
                '}';
    }
}
