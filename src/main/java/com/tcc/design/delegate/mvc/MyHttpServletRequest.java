package com.tcc.design.delegate.mvc;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 5:24
 * 3 * @Descripiton:
 */
public class MyHttpServletRequest  {

    private String uri;

    public String getUri() {
        return uri;
    }

    public MyHttpServletRequest setUri(String uri) {
        this.uri = uri;
        return this;
    }
}
