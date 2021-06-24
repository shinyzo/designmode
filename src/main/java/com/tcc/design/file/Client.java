package com.tcc.design.file;

import java.io.InputStream;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 11:20
 * Description:
 */
public class Client {

    public static void main(String[] args) {

        FileStreamHandler fileStreamHandler = new StreamHandlerDecorator(new ProductExcelHandler());
        fileStreamHandler.handler(null,FileType.EXCEL);



    }
}
