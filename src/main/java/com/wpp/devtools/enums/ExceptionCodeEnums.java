package com.wpp.devtools.enums;

import lombok.Getter;

/**
 * @program: volvo
 * @description: 异常状态码
 * @author: wpp
 * @create: 2020-06-01
 **/
@Getter
public enum ExceptionCodeEnums {

    OK(0, "成功"),
    ERROR(-1, "失败"),
    OTHER_ERROR(-2, "未知异常"),
    ID_NULL(-20001, "ID不能为NULL"),
    ID_NOT_EXISTS(-20002, "ID不存在"),
    JWT_VALID_ERROR(-20003, "身份验证异常"),
    JWT_VALID_OVERDUE(-20004, "TOKEN已过期"),
    JWT_ERROR(-20005, "TOKEN异常"),
    PARAM_ERROR(-20006, "参数异常"),
    EMAIL_SEND_ERROR(-20007, "邮件发送失败"),
    JPUSH_SEND_ERROR(-20008, "极光推送异常"),
    VERSION_OVERDUE(-20009, "当前版本已过期, 请更新APP"),
    UPLOAD_FILE_NULL(-20010, "上传文件不能为空"),
    UPLOAD_FILE_ERROR(-20011, "上传文件异常"),
    GET_EMAIL_FOLDER_ERROR(-20012, "获取邮件列表失败"),
    EMAIL_PARSE_ERROR(-20013, "邮件解析失败"),
    PARAM_NULL(-20014, "参数不能为空"),
    INSUFFICIENT_AUTHORITY(-20015, "权限不足"),
    TIME_ERROR(-20016, "时间解析异常"),
    OBJECT_ERROR(-20017, "对象解析异常"),
    COMMIT_ERROR(-20018, "请勿重复提交"),
    USER_POSITON_ERROR(-20019, "职位不匹配无法整改"),
    BEFOR_TIME(-20020, "只可操作当季数据"),
    COMPLETE(-20021, "已完成, 无需操作"),
    PASSWORD_UNQUALIFIED(-20022, "密码必须包含大小写字母、数字、特殊符号的8位以上组合"),
    STREAM_ERROR(-20023, "流异常"),

    ;

    private Integer code;

    private String msg;

    ExceptionCodeEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
