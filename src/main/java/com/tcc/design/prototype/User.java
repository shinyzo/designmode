package com.tcc.design.prototype;

import com.tcc.design.singleton.SingletonExample9;

import java.io.*;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 上午 10:59
 * 3 * @Descripiton:
 */
public class User implements Cloneable,Serializable{

    private  String name;

    private Integer age;

    private School school;

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }


    // 默认是浅拷贝，值类型的数据会进行数据拷贝，地址类型数据会指向同一个地址空间
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return deepClone();
    }


    /**
     * 深度拷贝，采用序列化
     * @return
     */
    public Object deepClone(){

        User u1 = null;
        try{

            ByteArrayOutputStream fileOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
            os.writeObject(this);
            os.flush();
            os.close();

            ByteArrayInputStream fileInputStream = new ByteArrayInputStream(fileOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            u1 = (User) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }


        return u1;

    }
}
