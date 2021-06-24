package com.tcc.design.file;

import java.io.InputStream;
import java.util.function.IntUnaryOperator;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 11:13
 * Description:
 */
public interface FileStreamHandler {

    public void handler(InputStream is, FileType fileType);

    public void handler(String key);

}
