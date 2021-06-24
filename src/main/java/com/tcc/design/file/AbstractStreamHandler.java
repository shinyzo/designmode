package com.tcc.design.file;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 13:41
 * Description:
 */
public abstract class AbstractStreamHandler implements FileStreamHandler {

    @Override
    public void handler(InputStream is, FileType fileType){
        switch (fileType){
            case EXCEL:
                handlerExcel(is);
                break;
            case TEXT:
                handlerText(is);
                break;
        }
    }



    @Override
    public void handler(String key) {
        handler(getInputStream(key),getFileType(key));
    }

    private InputStream getInputStream(String key){

        try(InputStream is = new FileInputStream(getFilePath(key))) {
            return is;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String getFilePath(String key){
        return key;
    }

    private FileType getFileType(String key){
        return FileType.EXCEL;
    }

    protected abstract void handlerText(InputStream is);

    protected abstract void handlerExcel(InputStream is);
}
