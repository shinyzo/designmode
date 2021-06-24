package com.tcc.design.file;

import java.io.InputStream;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 11:22
 * Description:
 */
public class ProductExcelHandler extends ExcelFileHandler {

    @Override
    protected void handlerExcel(InputStream is) {
        System.out.println("==>handlerExcel ");
    }




}
