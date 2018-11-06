/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
package com;

public class BinaryExpression extends Expression {
    public Expression left() {
        Expression e = new BinaryExpression();
        return e;
    }
    public Expression right() {
        Expression e = new BinaryExpression();
        return e;
    }

    /**
     * @return return sum of left and right expression
     */
    public int evalute() {
        return left().evalute() + right().evalute();
    }

    public String toString() {
        return "";
    }
}
