package com.fiona.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestKeyBoard {
    @Test
    public void test1() {
        int[] input = new int[]{2, 3};
        KeyBoard keyBoard = new KeyBoard();
        List<String> list = keyBoard.doConvert(input);
        KeyBoard secGenerationKeyBoard = new SecGenerationKeyBoard();
        List<String> secGenerationList = secGenerationKeyBoard.doConvert(input);
        Assert.assertTrue(list.size() == keyBoard.getChars(2).length * keyBoard.getChars(3).length);
        Assert.assertTrue(list.size() == secGenerationList.size());
    }

    @Test
    public void test2() {
        int[] input = new int[]{0, 3, 2, 1};
        KeyBoard keyBoard = new KeyBoard();
        List<String> list = keyBoard.doConvert(input);
        KeyBoard secGenerationKeyBoard = new SecGenerationKeyBoard();
        List<String> secGenerationList = secGenerationKeyBoard.doConvert(input);
        Assert.assertTrue(list.size() == keyBoard.getChars(2).length * keyBoard.getChars(3).length);
        Assert.assertTrue(list.size() == secGenerationList.size());
    }

    @Test
    public void test3() {
        int[] input = new int[]{0, 1};
        KeyBoard keyBoard = new KeyBoard();
        List<String> list = keyBoard.doConvert(input);
        KeyBoard secGenerationKeyBoard = new SecGenerationKeyBoard();
        List<String> secGenerationList = secGenerationKeyBoard.doConvert(input);
        Assert.assertTrue(list.size() == 0);
        Assert.assertTrue(list.size() == secGenerationList.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test4() {
        int[] input = new int[]{5, 24};
        KeyBoard keyBoard = new KeyBoard();
        List<String> list = keyBoard.doConvert(input);
    }

    @Test
    public void test5() {
        int[] input = new int[]{5, 24};
        KeyBoard secGenerationKeyBoard = new SecGenerationKeyBoard();
        List<String> secGenerationList = secGenerationKeyBoard.doConvert(input);
        Assert.assertTrue(secGenerationList.size() == secGenerationKeyBoard.getChars(5).length * (secGenerationKeyBoard.getChars(2).length + secGenerationKeyBoard.getChars(4).length));

    }
}
