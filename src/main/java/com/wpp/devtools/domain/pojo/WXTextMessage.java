package com.wpp.devtools.domain.pojo;

import lombok.Data;

/**
 * @program: volvo-sever
 * @description:
 * @author: wpp
 * @create: 2020-08-17
 **/
@Data
public class WXTextMessage extends WXBaseMessage{
    private String Content;
    private String MsgId;
}
