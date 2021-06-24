package com.tcc.design.template.file;

import java.util.List;

/**
 * Author: liangming.zhang
 * Date : 2021/6/23 - 14:43
 * Description:
 */
public abstract class AbstractFIle<Item> {

    final public void handler(){
        List<Item> result = before();
        process(result);
        after();
    }

    protected abstract void after();

    private void process(List<Item> result){
        result.stream().forEach(item->{
            try{
                processItem(item);
            }catch (Exception e){
                onException(e);
            }

        });

    }

    protected abstract void processItem(Item item);
    
    protected abstract void onException(Exception e);

    protected abstract List<Item> before();

}
