/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
public class Subtraction extends BinaryExpression{
    Expression left, right;
    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * @return Subtraction of left and right Expression
     */
    public int evalute() {
        return left.evalute() - right.evalute();
    }
}
