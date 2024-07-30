package calculator;

import java.security.Key;
import java.util.List;

public class ArithmeticCalculator extends Calculator {

    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;
    private ModOperator modOperator;

    public ArithmeticCalculator(){
        super(); // result 초기화
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
        this.modOperator = new ModOperator();
    }


    public void printResult(List<Integer> resultList) {
        for (int n : resultList) {
            System.out.println(n);
        }
    }

    public int calculate(int firstNum, int secondNum, String operator)
            throws NotDefOpException, ZeroDivException {
        int result = 0;
        switch (operator) {
            case "+":
                result = addOperator.operate(firstNum, secondNum);
                break;
            case "-":
                result = subtractOperator.operate(firstNum, secondNum);
                break;
            case "*":
                result = multiplyOperator.operate(firstNum, secondNum);
                break;
            case "/":
                result = divideOperator.operate(firstNum, secondNum);
                break;
            case "%":
                result = modOperator.operate(firstNum, secondNum);
                break;
            default:
                throw new NotDefOpException("사칙연산 기호 또는 나머지 연산자 중 하나를 입력해주세요.");
        }
        return result;
    }
}
