/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
package com.Excep;

import java.util.ArrayList;

public class NullPointerExcep {
    ArrayList<String> r ;
    public NullPointerExcep() {
        try{
            r.add("ok");
        } catch (java.lang.NullPointerException e) {
            System.out.println("NullPointer Exception");
        }
    }
}