/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */

import Excep.*;

public class ExpressionTest {
    public static void main(String[] args) {
        Expression ten = new Numeral(10);
        Expression minusOne = new Numeral(-1);
        Expression two = new Numeral(2);
        Expression three = new Numeral(3);
        Expression zero = new Numeral(0);

        Expression result = new Square(new Addition(new Addition(new Square(ten), minusOne), new Multiplication(two, three)));
        System.out.println(result.evalute());

        NullPointerExcep npte = new NullPointerExcep();
        ArithmeticExce ae = new ArithmeticExce();
        ArrayIndexOutOfBoundsExcep aiobe = new ArrayIndexOutOfBoundsExcep();
        ClassCastExcep cce = new ClassCastExcep();
        IOExcep ioe = new IOExcep();
        FileNotFoundExcep fnfe = new FileNotFoundExcep();

    }

}