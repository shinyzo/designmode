package com.tcc.design.prototype;

import java.io.Serializable;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 11:04
 * 3 * @Descripiton:
 */

public class School implements Serializable {

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

}
