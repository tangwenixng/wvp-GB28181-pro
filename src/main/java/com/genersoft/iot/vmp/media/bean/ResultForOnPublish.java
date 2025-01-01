package com.genersoft.iot.vmp.media.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResultForOnPublish {

    private boolean enable_audio;
    private boolean enable_mp4;
    private int mp4_max_second;
    private String mp4_save_path;
    private String stream_replace;
    private Integer modify_stamp;

}
