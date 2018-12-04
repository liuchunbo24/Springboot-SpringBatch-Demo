package com.batch.processor;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by Administrator on 2018/12/4.
 */
public class Processor implements ItemProcessor<String,String> {
    @Override
    public String process(String data) throws Exception{
        return  data.toUpperCase();
    }
}
