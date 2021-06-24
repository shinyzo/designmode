package com.tcc.design.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 15:33
 * Description:
 */
public class Exam {

    List<Question> questionList = new ArrayList<>();

    public Exam addQuestion(Question q){
        questionList.add(q);
        return this;
    }

    public Exam removeQuestion(Question q){
        questionList.remove(q);
        return this;
    }

    public Exam clear(){
        questionList.clear();
        return this;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }


    public void show(){
        questionList.forEach(q->{
            System.out.println(q.getQuestionName());
            System.out.println(q.getAnswerMap());
            System.out.println(q.getCorrectAnswer());
        });
    }
}
