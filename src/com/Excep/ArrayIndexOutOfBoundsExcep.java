/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
package com.Excep;

public class ArrayIndexOutOfBoundsExcep {
    public ArrayIndexOutOfBoundsExcep() {
        try{
            int arr[] = new int[10];
            System.out.println(arr[11]);
        } catch(java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bound");
        }

    }
}