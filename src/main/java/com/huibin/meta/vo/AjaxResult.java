/**
 * 
 */
package com.huibin.meta.vo;

import java.util.LinkedHashMap;

import io.swagger.annotations.ApiModel;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;


/**
 * ajax请求返回结果封装
 * 
 * @Date 2011-7-13
 */
@ApiModel(value = "AjaxResult", description = "结果bean")
public class AjaxResult extends LinkedHashMap<String, Object> {

    /**
     * 
     */
    private static final long serialVersionUID = 4004136263013658272L;

    /**
     * 响应code，默认<code>ResponseCode.SUCCESS</code>
     */
    public static final String CODE = "code";

    /**
     * 执行coremail func返回的错误码
     */
    public static final String ERROR_CODE = "errorCode";

    /**
     * 执行coremail func返回的错误码的subCode
     */
    public static final String SUB_ERROR_CODE = "subErrorCode";

    /**
     * 操作影响的数据
     */
    public static final String DATA = "data";

    /**
     * 额外的信息
     */
    public static final String OTHER = "other";

    public AjaxResult() {
        setCode(HttpStatus.OK);
    }

    public AjaxResult(Object data) {
        setData(data);
        setCode(HttpStatus.OK);
    }

    public AjaxResult(HttpStatus responseCode) {
        setCode(responseCode);
    }

    public AjaxResult(HttpStatus responseCode, Object data) {
        setCode(responseCode);
        setData(data);
    }

    public AjaxResult(HttpStatus responseCode, String errorCode) {
        setCode(responseCode);
        setCode(HttpStatus.BAD_REQUEST);
    }

    public HttpStatus getCode() {
        return (HttpStatus) get(CODE);
    }

    public void setCode(HttpStatus responseCode) {
        Assert.notNull(responseCode, "code must not be null!");
        put(CODE, responseCode.value());
    }

    public String getErrorCode() {
        return (String) get(ERROR_CODE);
    }

    public void setErrorCode(String errorCode) {
        put(ERROR_CODE, errorCode);
    }

    public Object getData() {
        return (String) get(DATA);
    }

    public void setData(Object data) {
        put(DATA, data);
    }

    public Object getOther() {
        return (String) get(OTHER);
    }

    public void setOther(Object other) {
        put(OTHER, other);
    }
}
