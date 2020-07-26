package com.fiona.test;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author fiona
 */
@Slf4j
public class KeyBoard {
    protected final char[][] arr = {
            {}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'},
            {'g', 'h', 'i'}, {'j', 'k', 'l'},
            {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}
    };
    protected Converter converter=new Converter();

    public KeyBoard() {
    }

    public char[] getChars(int num) {
        if (num > 9) {
            return new char[]{};
        }
        return arr[num];
    }



    public  List<String> doConvert(int[] input) {
        List<String> list = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        for (int i : input) {
            if(i < 0 || i > 9){
                throw new IllegalArgumentException("Illegal param["+i+"].Please control between 0-9");
            }
            if (getChars(i).length == 0) {
                continue;
            }
            converter.commomConvert(list,temp,getChars(i));

        }
        return list;
    }






    }
