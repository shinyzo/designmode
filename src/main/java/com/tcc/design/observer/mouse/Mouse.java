package com.tcc.design.observer.mouse;

/**
 * 1 * @Author: zhangliangming
 * 2 * @Date: 2021/3/5 0005 上午 9:16
 * 3 * @Descripiton:
 */
public class Mouse extends EvenetListener {


    public void click(ICallBack callBack)throws Exception{
        System.out.println("鼠标单击");
        callBack.callBack();
    }


    @CallBack(callback = "dbClickCallBack")
    public void dbClick(String s)throws Exception{
        System.out.println("鼠标双击"+s);
        trigger(MouseEventType.ON_DBCLICK);
    }

    public String dbClickCallBack(){
        System.out.println("鼠标双击事件回调");
        return null;
    }



    public void up()throws Exception{
        System.out.println("鼠标按下");
        trigger(MouseEventType.ON_UP);
    }




    public Mouse mouseOver(){

        System.out.println("鼠标悬停");
        return this;
    }

    // 链调
    public void addCallBack(ICallBack callBack)throws Exception{
        callBack.callBack();
    }
}
