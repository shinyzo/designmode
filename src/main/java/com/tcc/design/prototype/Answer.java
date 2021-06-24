package com.tcc.design.prototype;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 15:34
 * Description:
 */
public class Answer implements Cloneable {

    private String label;

    private String answer;

    public Answer(String label, String answer) {
        this.label = label;
        this.answer = answer;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
