package com.tcc.design.template;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 9:48
 * 3 * @Descripiton:
 */
public class JdbcTemplate {

    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    private Connection getConnent(){
        try {
            return this.dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private PreparedStatement getPreparedStatement(Connection connection,String sql)throws SQLException {
        return connection.prepareStatement(sql);
    }

    private ResultSet getResultset(PreparedStatement ps,Object[] values)throws SQLException{
        for(int i=0;i<values.length;i++){
            ps.setObject(i,values[i]);
        }
        return ps.executeQuery();
    }


    private void closeResultset(ResultSet rs)throws SQLException{
        if(rs!=null){
            rs.close();
        }
    }

    private void closePreparedStatement(PreparedStatement ps)throws SQLException{
        if(ps!=null){
            ps.close();
        }
    }


    private void closeConnection(Connection conn)throws SQLException{
        if(conn!=null){
            conn.close();
        }
    }

    public List<?> executeQuery(String sql,RowMapper rowMapper, Object[] values){
        // 1 建立连接
        Connection conn = this.getConnent();
        List<Object> result = new ArrayList<>();
        // prepareStatement
        try {
            PreparedStatement ps = this.getPreparedStatement(conn,sql);
            ResultSet rs = this.getResultset(ps,values);
            int rowNum = 0;
            while(rs.next()){
                result.add(rowMapper.getRowMapper(rs,rowNum));
            }
            this.closeResultset(rs);
            this.closePreparedStatement(ps);
            this.closeConnection(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 执行sql

        // 获取结果集

        // 关闭rs

        // 关闭ps

        // 关闭连接，或者放回缓存池
        return result;
    }


}
