package com.tcc.design.proxy.gen;
import java.lang.reflect.Method;
public class $Proxy0 implements IUser{
  public MyInvocationHandler h;
  public $Proxy0(MyInvocationHandler h){
    this.h = h;
  }
@Override
public final void findLove(){
try{
  Method m = IUser.class.getMethod("findLove");
  this.h.invoke(this,m,(Object[])null);
}catch(Throwable e){
  e.printStackTrace();
}
}
}