package com.tcc.design.proxy.gen;

import com.tcc.design.proxy.jdk.HaijingHouse;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/3 0003 下午 5:34
 * 3 * @Descripiton:
 */
public class MyProxy implements MyInvocationHandler{

    private Object obj;

    public static Object newProxyInstance(Class<?> clazz)throws Exception{

        // 生成java代码
        String file = generatorSrc(clazz.getInterfaces());
        String filepath = MyProxy.class.getResource("").getPath();
        System.out.println(filepath);

        FileOutputStream fileOutputStream = new FileOutputStream(new File(filepath+"/$Proxy0.java"));
        fileOutputStream.write(file.getBytes());
        fileOutputStream.flush();

        // 编译成class文件

        // 类加载器加载class文件值jvm内存中

        // 返回字节码重组以后的代理对象


        return null;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("before");
        result = method.invoke(obj,args);
        System.out.println("after");
        return result;
    }

    public static String generatorSrc(Class<?>[] interfaces){
        StringBuffer buffer = new StringBuffer();
        buffer.append("package com.tcc.design.proxy.gen;").append("\r\n");
        buffer.append("import java.lang.reflect.Method;").append("\r\n");

        buffer.append("public class $Proxy0 implements " + interfaces[0].getSimpleName() +"{").append("\r\n");
        buffer.append("  public MyInvocationHandler h;").append("\r\n");
        buffer.append("  public $Proxy0(MyInvocationHandler h){" ).append("\r\n");
        buffer.append("    this.h = h;").append("\r\n");
        buffer.append("  }").append("\r\n");

        for(int i=0;i<interfaces[0].getMethods().length;i++){
            Method m = interfaces[0].getMethods()[i];
            buffer.append("@Override").append("\r\n");
            buffer.append("public final " + m.getReturnType().getName() +" "+m.getName()+"(){").append("\r\n");
            buffer.append("try{").append("\r\n");
            buffer.append("Method m = "+interfaces[0].getName()+".class.getMethod(\""+m.getName()+"\");");
            buffer.append("this.h.invoke(this,m,(Object[])null);").append("\r\n");
            buffer.append("}catch(Throwable e){").append("\r\n");
            buffer.append("  e.printStackTrace();").append("\r\n");
            buffer.append("}").append("\r\n");

            buffer.append("}").append("\r\n");
        }

        buffer.append("}");
        return buffer.toString();
    }

    public static void main(String[] args) throws Exception{

        MyProxy.newProxyInstance(User.class);
    }
}
