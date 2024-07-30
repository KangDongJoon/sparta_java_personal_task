package calculator;

import java.util.*;

public class Calculator {
    private List<Integer> resultList;
    private List<Double> circleAreaList;

    public Calculator(){
        resultList = new ArrayList<>();
        circleAreaList = new ArrayList<>();
    }

    public List<Integer> getResultList(){
        return resultList;
    }

    public void printResult(List<Integer> resultList){
        for(int n : resultList){
            System.out.println(n);
        }
    }

    public List<Double> getCircleAreaList(){
        return circleAreaList;
    }

    public void printCircleResult(List<Double> circleAreaList){
        for(double n : circleAreaList){
            System.out.println(n);
        }
    }

    public double calculateCircleArea(int num){
        return Math.pow(num, 2) * 3.14;
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


