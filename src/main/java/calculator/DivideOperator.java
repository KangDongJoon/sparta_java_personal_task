package calculator;

public class DivideOperator {
    public int operate(int n1, int n2) throws ZeroDivException {
        if (n2 == 0) {
            throw new ZeroDivException("0으로 나눌 수 없습니다.");
        }
        return n1 / n2;
    }
}
