package com.sld.entity;

import lombok.Data;

/**
 * Created by diwu.sld on 2017/6/20.
 */
@Data
public class PublicParams {
    private String method;
    private String token;
    private String timestamp;
    private String format;
    private String  version;
    private String sign;
}
