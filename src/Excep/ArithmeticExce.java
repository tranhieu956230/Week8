/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
package Excep;

public class ArithmeticExce {
    public ArithmeticExce() {
        try {
           int result = 10 / 0;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("Lỗi chia cho không");
        }
    }
}
