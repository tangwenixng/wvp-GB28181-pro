package com.genersoft.iot.vmp.media.zlm.dto.hook;

import com.genersoft.iot.vmp.media.zlm.dto.ServerKeepaliveData;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * zlm hook事件中的on_play事件的参数
 *
 * @author lin
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class OnServerKeepaliveHookParam extends HookParam {

    private ServerKeepaliveData data;
}
