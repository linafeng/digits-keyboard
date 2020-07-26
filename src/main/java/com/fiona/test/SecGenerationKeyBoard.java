package com.fiona.test;


import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fiona
 */
@Slf4j
public class SecGenerationKeyBoard extends KeyBoard {


    public SecGenerationKeyBoard() {
    }

    @Override
    public char[] getChars(int num) {
        if (num > 99) {
            return new char[]{};
        } else {
            int tens = num / 10;
            int bits = num % 10;
            char[] newArr = new char[arr[tens].length + arr[bits].length];
            char[] chars = arr[tens];
            System.arraycopy(arr[tens], 0, newArr, 0, arr[tens].length);
            System.arraycopy(arr[bits], 0, newArr, arr[tens].length, arr[bits].length);
            return newArr;
        }
    }
    @Override
    public  List<String> doConvert(int[] input) {
        List<String> list = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        for (int i : input) {
            if(i < 0 || i > 99){
                throw new IllegalArgumentException("Illegal param["+i+"].Please control between 0-99");
            }
            if (getChars(i).length == 0) {
                continue;
            }
            converter.commomConvert(list,temp,getChars(i));

        }
        return list;

    }


}
