package com.tcc.design.adapter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 5:53
 * 3 * @Descripiton:
 */
public class LoginService {

    private Map<String,Member> memberMap = new HashMap<>();

    public Member register(String username,String password){
        Member member = new Member();
        member.setMemberName(username);
        member.setMemberId(UUID.randomUUID().toString());
        if(password == null){
            password = UUID.randomUUID().toString();
        }
        member.setPassword(password);
        memberMap.put(member.getMemberId(),member);

        return member;
    }


    public boolean login(String username,String password){

        Iterator iterator = memberMap.keySet().iterator();
        while (iterator.hasNext()){
           String memberId = (String) iterator.next();
           Member member = memberMap.get(memberId);
           if(member.getMemberName().equals(username) && member.getPassword().equals(password)){
               return true;
           }
        }
        return false;
    }

}
