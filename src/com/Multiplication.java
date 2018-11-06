/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
package com;

public class Multiplication extends BinaryExpression{
    private Expression left, right;
    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * @return multiplication of left and right Expression
     */
    public int evalute() {
        return left.evalute() * right.evalute();
    }
}
