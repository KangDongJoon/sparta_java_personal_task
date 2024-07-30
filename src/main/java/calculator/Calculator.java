package calculator;

import java.util.*;

public class Calculator {
    private List<Integer> resultList = new ArrayList<>();

    public List<Integer> getResultList(){
        return resultList;
    }

    public void printResult(List<Integer> resultList){
        for(int n : resultList){
            System.out.println(n);
        }
    }

    public int calculate(int firstNum, int secondNum, String operator)
            throws NotDefOpException, ZeroDivException {
        int result = 0;
        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                if(secondNum == 0){
                    throw new ZeroDivException("0으로 나눌 수 없습니다.");
                }
                result = firstNum / secondNum;
                break;
            default:
                throw new NotDefOpException("사칙연산 기호 중 하나를 입력해주세요.");

        }
        return result;
    }
}


