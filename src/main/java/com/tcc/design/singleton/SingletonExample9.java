package com.tcc.design.singleton;

import java.io.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 9:33
 * 3 * @Descripiton:
 *
 * 通过反序列化 破坏单例
 */
@ThreadSafe
public class SingletonExample9 implements Serializable {

    private static final SingletonExample9 INSTANCE = new SingletonExample9();

    private SingletonExample9(){

    }

    public static SingletonExample9 getInstance()throws Exception {

        SingletonExample9 s1 = null;
        SingletonExample9 s2 = INSTANCE;

        FileOutputStream fileOutputStream = new FileOutputStream("seriable.obj");
        ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
        os.writeObject(s2);
        os.flush();
        os.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("seriable.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        s1 = (SingletonExample9) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1==s2);

        return s2;
    }

    // 解决反序列化获取对象
   public Object readResolve(){
        return INSTANCE;
   }

}
