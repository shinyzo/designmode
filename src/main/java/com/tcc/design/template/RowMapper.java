package com.tcc.design.template;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 10:08
 * 3 * @Descripiton:
 */
public interface RowMapper<T> {

    public T getRowMapper(ResultSet resultSet,int rowNum)  throws SQLException;
}
