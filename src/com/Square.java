/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
package com;

public class Square extends Expression {
    Expression expression;
    public Square(Expression e) {
        this.expression = e;
    }

    /**
     * @return Square of two the Expression
     */
    public int evalute() {
        return expression.evalute() * expression.evalute();
    }


    public String toString() {
        return String.valueOf(expression.evalute());
    }
}
