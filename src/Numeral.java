/**
 * @author Trần Đức Hiếu
 * @version 1.0.0
 * @date 29/10/2018
 */
public class Numeral extends Expression {
    private int value;
    public Numeral(int value) {
        this.value = value;
    }
    public Numeral() {

    }

    /**
     * @return value of Numeral
     */
    public int evalute() {
        return this.value;
    }
    public String toString() {
        return String.valueOf(value);
    }
}



