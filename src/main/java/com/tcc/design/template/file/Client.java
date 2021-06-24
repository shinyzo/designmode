package com.tcc.design.template.file;

import java.util.Arrays;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 14:56
 * Description:
 */
public class Client {
    public static void main(String[] args)throws Exception {
//        TextFileProcess abstractFIle = new TextFileProcess();
//        abstractFIle.handler();

        int[] a = {1,24,3,7,2,99};

        Test[] tests = {
                new Test(22),
                new Test(19)
        };

        Arrays.sort(tests);
        Arrays.sort(a);
        Arrays.stream(a).forEach(x->{
            System.out.println(x);
        });
        Arrays.stream(tests).forEach(test->{
            System.out.println(test.getAge());
        });


    }
}
