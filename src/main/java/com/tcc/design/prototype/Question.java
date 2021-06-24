package com.tcc.design.prototype;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

import java.util.Map;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 15:33
 * Description:
 */
public class Question {

    private String questionName;

    private Map<String,Answer> answerMap;

    private Answer correctAnswer;

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public Map<String, Answer> getAnswerMap() {
        return answerMap;
    }

    public void setAnswerMap(Map<String, Answer> answerMap) {
        this.answerMap = answerMap;
    }

    public Answer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Answer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
