package com.tcc.design.prototype;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Author: liangming.zhang
 * Date : 2021/5/25 - 15:39
 * Description:
 */
public class Client {

    public static void main(String[] args) {

        Question question = new Question();
        question.setQuestionName("今天天气怎么样？");
        Answer answer1 = new Answer("A","晴天");
        Answer answer2 = new Answer("B","阴天");
        Answer answer3 = new Answer("C","下雨");
        Answer answer4 = new Answer("D","下雪");
        Map<String,Answer> answerMap = new LinkedHashMap<>();
        answerMap.put(answer1.getLabel(),answer1);
        answerMap.put(answer2.getLabel(),answer2);
        answerMap.put(answer3.getLabel(),answer3);
        answerMap.put(answer4.getLabel(),answer4);
        question.setAnswerMap(answerMap);
        question.setCorrectAnswer(answer1);

        Question question2 = new Question();
        question2.setQuestionName("今天温度多少度？");
        Answer answer5 = new Answer("A","晴天");
        Answer answer6 = new Answer("B","阴天");
        Answer answer7 = new Answer("C","下雨");
        Answer answer8 = new Answer("D","下雪");
        Map<String,Answer> answerMap2 = new LinkedHashMap<>();
        answerMap2.put(answer5.getLabel(),answer5);
        answerMap2.put(answer6.getLabel(),answer6);
        answerMap2.put(answer7.getLabel(),answer7);
        answerMap2.put(answer8.getLabel(),answer8);
        question2.setAnswerMap(answerMap2);
        question2.setCorrectAnswer(answer5);


        Exam exam = new Exam();
        exam.addQuestion(question);
        exam.addQuestion(question2);

        exam.show();




    }

}
