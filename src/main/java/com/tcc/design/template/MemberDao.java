package com.tcc.design.template;

import com.tcc.design.strategy.Order;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 上午 10:13
 * 3 * @Descripiton:
 */
public class MemberDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(null);

    public List<Member> getMemberList(){
        String sql = "select * from member";
        return ( List<Member>) jdbcTemplate.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member getRowMapper(ResultSet resultSet, int rowNum) throws SQLException {
                Member member = new Member();
                member.setMemberId(resultSet.getLong("member_id"));
                member.setMemeberName(resultSet.getString("member_name"));
                return member;
            }
        },null);

    }

}
