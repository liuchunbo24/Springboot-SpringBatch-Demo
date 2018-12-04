package com.batch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

/**
 * Created by Administrator on 2018/12/4.
 */
public class Reader implements ItemReader<String> {

    private String[] messages = { "篮球之神 Michael Jordan",
                                     "欢迎来到batch示例 Welcome to Spring Batch Example",
                                     "The more time goes by,The more life happens" };

    private int count = 0;

    @Override
    public  String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException{
        if(count<messages.length){
            return messages[count++];
        }else{
            count=0;
        }
        return null;
    }



}
