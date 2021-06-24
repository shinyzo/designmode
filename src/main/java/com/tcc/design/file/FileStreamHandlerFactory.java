package com.tcc.design.file;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 13:50
 * Description:
 */
public class FileStreamHandlerFactory {

    public static FileStreamHandler getHandler(String key){
        return new ProductExcelHandler();

    }
}
