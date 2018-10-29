/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
package Excep;

public class ClassCastExcep {
    public ClassCastExcep() {
        try {
            Object i = Integer.valueOf(42);
            String s = (String) i;

        } catch(java.lang.ClassCastException e) {
            System.out.println("Class cast Exception" );
        }

    }
}