package com.fiona.test;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fiona
 */
public class Converter {

    public void commomConvert(List<String> list, List<String> temp, char[] chars) {
        if (list.isEmpty()) {
            for (char d : chars) {
                list.add(String.valueOf(d));
            }
        } else {
            temp = new ArrayList<>(list);
            list.clear();
            for (String s : temp) {
                for (char d : chars) {
                    list.add(s + d);
                }
            }
        }
    }
}

