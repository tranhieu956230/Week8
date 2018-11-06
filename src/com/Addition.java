/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
package com;
public class Addition extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Addition(Expression e1, Expression e2) {
        this.left = e1;
        this.right = e2;
    }

    /**
     * @return sum of two Expression
     */
    public int evalute() {
        return left.evalute() + right.evalute();
    }
}
