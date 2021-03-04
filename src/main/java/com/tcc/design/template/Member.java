package com.tcc.design.template;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/4 0004 下午 1:18
 * 3 * @Descripiton:
 */
public class Member {

    private Long memberId;


    private String memeberName;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getMemeberName() {
        return memeberName;
    }

    public void setMemeberName(String memeberName) {
        this.memeberName = memeberName;
    }
}
