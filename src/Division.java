/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
import java.lang.*;
public class Division extends BinaryExpression {
    private Expression left, right;
    public Division(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * @return division of two left and right expresion
     * @throws ArithmeticException
     */
    public int evalute() throws ArithmeticException{
        return left.evalute() / right.evalute();
    }
}
